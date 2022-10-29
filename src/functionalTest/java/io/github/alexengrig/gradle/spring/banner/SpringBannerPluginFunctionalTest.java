/*
 * Copyright 2022 Alexengrig Dev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexengrig.gradle.spring.banner;

import org.assertj.core.api.SoftAssertions;
import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.BuildTask;
import org.gradle.testkit.runner.GradleRunner;
import org.gradle.testkit.runner.TaskOutcome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.assertj.core.api.Assertions.assertThat;

class SpringBannerPluginFunctionalTest {

    final String projectName = "app";

    @TempDir
    Path projectDir;
    Path settingsFile;
    Path buildFile;

    void writeString(Path file, String text) {
        try {
            Files.write(file, text.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void writeBuild(String text) {
        writeString(buildFile, text);
    }

    GradleRunner gradleRunner() {
        return GradleRunner.create()
                .withProjectDir(projectDir.toFile())
                .withPluginClasspath();
    }

    @BeforeEach
    void setUp() {
        settingsFile = projectDir.resolve("settings.gradle");
        writeString(settingsFile, "rootProject.name = '" + projectName + "'");
        buildFile = projectDir.resolve("build.gradle");
        // language=groovy
        writeBuild("""
                plugins {
                    id 'java'
                    id 'io.github.alexengrig.spring-banner'
                }
                """);
    }

    @Test
    void should_showBanner() {
        BuildResult result = gradleRunner()
                .withArguments("showBanner")
                .build();
        SoftAssertions.assertSoftly(softly -> {
            assertThat(result.task(":showBanner"))
                    .as("task :showBanner")
                    .isNotNull()
                    .extracting(BuildTask::getOutcome)
                    .as("task outcome")
                    .isEqualTo(TaskOutcome.SUCCESS);
            assertThat(result.getOutput())
                    .containsIgnoringNewLines(
                            "> Task :showBanner" +
                            "                    " +
                            "   __ _ _ __  _ __  " +
                            "  / _` | '_ \\| '_ \\ " +
                            " | (_| | |_) | |_) |" +
                            "  \\__,_| .__/| .__/ " +
                            "       |_|   |_|    " +
                            "Powered by Spring Boot v${spring-boot.version}"
                    );
        });
    }

    @Test
    void should_showBanner_custom() {
        // language=groovy
        writeBuild("""
                springBanner {
                    text = 'foo'
                    separator = '::'
                    caption = 'bar'
                    font = '3d'
                }
                """);
        BuildResult result = gradleRunner()
                .withArguments("showBanner")
                .build();
        SoftAssertions.assertSoftly(softly -> {
            assertThat(result.task(":showBanner"))
                    .as("task :showBanner")
                    .isNotNull()
                    .extracting(BuildTask::getOutcome)
                    .as("task outcome")
                    .isEqualTo(TaskOutcome.SUCCESS);
            assertThat(result.getOutput())
                    .containsIgnoringNewLines(
                            "> Task :showBanner" +
                            "   ████                  " +
                            "  ░██░                   " +
                            " ██████  ██████   ██████ " +
                            "░░░██░  ██░░░░██ ██░░░░██" +
                            "  ░██  ░██   ░██░██   ░██" +
                            "  ░██  ░██   ░██░██   ░██" +
                            "  ░██  ░░██████ ░░██████ " +
                            "  ░░    ░░░░░░   ░░░░░░  ::bar"
                    );
        });
    }

}
