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

package io.github.alexengrig.gradle.spring.banner.task;

import io.github.alexengrig.gradle.spring.banner.SpringBannerExtension;
import io.github.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

import javax.inject.Inject;

/**
 * @since 0.1.0
 */
public class ShowSpringBannerTask extends DefaultTask {

    private static final String NAME = "showBanner";

    private final Project project;
    private final SpringBannerExtension extension;
    private final FigletBannerRenderer renderer;

    /**
     * @since 0.1.0
     */
    @Inject
    public ShowSpringBannerTask(Project project, FigletBannerRenderer renderer) {
        this.project = project;
        this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        this.renderer = renderer;
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Displays Spring banner.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        var renderer = FigletBannerRenderer.SINGLETON;
        tasks.register(NAME, ShowSpringBannerTask.class, project, renderer);
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void display() {
        String text = extension.getTextValue(project);
        String caption = extension.getCaptionValue();
        String font = extension.getFontValue();
        String banner = renderer.render(font, text);
        if (caption.isBlank()) {
            System.out.println(banner);
        } else {
            String separator = extension.getSeparatorValue();
            System.out.println(banner + separator + caption);
        }
    }

}
