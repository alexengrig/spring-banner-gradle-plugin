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

import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.provider.Property;

/**
 * @since 0.1.0
 */
public interface SpringBannerExtension {

    /**
     * @since 0.1.0
     */
    String NAME = "springBanner";

    /**
     * @since 0.1.0
     */
    static void create(Project project) {
        ExtensionContainer extensions = project.getExtensions();
        extensions.create(NAME, SpringBannerExtension.class);
    }

    /**
     * @since 0.1.0
     */
    Property<String> getText();

    /**
     * @since 0.1.0
     */
    default String getTextValue(Project project) {
        return getText()
                .convention(project.getName())
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getSeparator();

    /**
     * @since 0.1.0
     */
    default String getSeparatorValue() {
        return getSeparator()
                .convention(System.lineSeparator())
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getCaption();

    /**
     * @since 0.1.0
     */
    default String getCaptionValue() {
        return getCaption()
                .convention("Powered by Spring Boot v${spring-boot.version}")
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getFont();

    /**
     * @since 0.1.0
     */
    default String getFontValue() {
        return getFont()
                .convention("standard")
                .get();
    }

}
