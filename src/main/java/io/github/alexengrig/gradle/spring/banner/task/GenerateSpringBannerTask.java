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

package io.github.alexengrig.gradle.spring.banner.task;

import io.github.alexengrig.gradle.spring.banner.SpringBannerExtension;
import io.github.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

import javax.inject.Inject;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

/**
 * @since 0.1.0
 */
public class GenerateSpringBannerTask extends DefaultTask {

    /**
     * @since 0.1.0
     */
    public static final String NAME = "generateBanner";

    private static final String FILENAME = "banner.txt";

    private final Project project;
    private final SpringBannerExtension extension;
    private final FigletBannerRenderer renderer;

    /**
     * @since 0.1.0
     */
    @Inject
    public GenerateSpringBannerTask(Project project, FigletBannerRenderer renderer) {
        this.project = project;
        this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        this.renderer = renderer;
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Generates '" + FILENAME + "'.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        var renderer = FigletBannerRenderer.SINGLETON;
        var generateTask = tasks.register(NAME, GenerateSpringBannerTask.class, project, renderer);
        Task processResourceTask = tasks.getByName(project.getExtensions()
                .getByType(SourceSetContainer.class)
                .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                .getProcessResourcesTaskName());
        processResourceTask.finalizedBy(generateTask.get());
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void generate() {
        Path path = Objects.requireNonNull(project.getExtensions()
                        .getByType(SourceSetContainer.class)
                        .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                        .getOutput()
                        .getResourcesDir(), "sourceSets.main.resourcesDir")
                .toPath()
                .resolve(FILENAME);
        String text = extension.getTextValue(project);
        String font = extension.getFontValue();
        String banner = renderer.render(font, text);
        String caption = extension.getCaptionValue();
        String separator = extension.getSeparatorValue();
        String result = caption.isBlank()
                ? banner
                : banner + separator + caption;
        try {
            Path dir = path.getParent();
            if (!Files.exists(dir)) {
                Files.createDirectories(dir);
            }
            Files.write(path, (result + separator).getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
