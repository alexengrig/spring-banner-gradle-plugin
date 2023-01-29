/*
 * Copyright 2022-2023 Alexengrig Dev.
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
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            Files.deleteIfExists(file);
            Files.write(file, text.getBytes(), StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void appendString(Path file, String text) {
        try {
            Files.write(file, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void build(String text) {
        appendString(buildFile, text);
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
        writeString(buildFile, """
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
        build("""
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

    @Test
    void should_generateBanner_custom() throws URISyntaxException {
        URL resource = SpringBannerPluginFunctionalTest.class.getClassLoader().getResource("gen.txt");
        assertThat(resource)
                .as("gen.txt")
                .isNotNull();
        Path expectedBanner = Paths.get(resource.toURI());
        // language=groovy
        build("""
                springBanner {
                    text = 'gen'
                }
                """);
        BuildResult result = gradleRunner()
                .withArguments("generateBanner")
                .withDebug(true)
                .build();
        SoftAssertions.assertSoftly(softly -> {
            assertThat(result.task(":generateBanner"))
                    .as("task :generateBanner")
                    .isNotNull()
                    .extracting(BuildTask::getOutcome)
                    .as("task outcome")
                    .isEqualTo(TaskOutcome.SUCCESS);
            Path banner = projectDir.resolve("build/resources/main/banner.txt");
            softly.assertThat(banner)
                    .as("build/resources/main/banner.txt")
                    .exists()
                    .hasSameBinaryContentAs(expectedBanner);
        });
    }

}
