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

import io.github.alexengrig.gradle.spring.banner.task.GenerateSpringBannerTask;
import io.github.alexengrig.gradle.spring.banner.task.ShowAllSpringBannerFontsTask;
import io.github.alexengrig.gradle.spring.banner.task.ShowAllSpringBannersTask;
import io.github.alexengrig.gradle.spring.banner.task.ShowSpringBannerTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @since 0.1.0
 */
public class SpringBannerPlugin implements Plugin<Project> {

    /**
     * @since 0.1.0
     */
    @Override
    public void apply(Project project) {
        SpringBannerExtension.create(project);
        ShowSpringBannerTask.register(project);
        ShowAllSpringBannersTask.register(project);
        ShowAllSpringBannerFontsTask.register(project);
        GenerateSpringBannerTask.register(project);
    }

}
