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

import io.github.alexengrig.gradle.spring.banner.figlet.Fonts;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

/**
 * @since 0.1.0
 */
public class ShowAllSpringBannerFontsTask extends DefaultTask {

    /**
     * @since 0.1.0
     */
    public static final String NAME = "showAllBannerFonts";

    /**
     * @since 0.1.0
     */
    public ShowAllSpringBannerFontsTask() {
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Displays all Spring banner fonts.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        tasks.register(NAME, ShowAllSpringBannerFontsTask.class);
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void display() {
        System.out.println("Fonts: " + Fonts.all());
    }

}
