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

package io.github.alexengrig.gradle.spring.banner.figlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FigletBannerRendererIntegrationTest {

    FigletBannerRenderer renderer;

    @BeforeEach
    void setUp() {
        renderer = new FigletBannerRenderer();
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    void shouldNot_render_nullableFont() {
        assertThatThrownBy(() -> renderer.render(null, "text"))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("font");
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    void shouldNot_render_nullableText() {
        assertThatThrownBy(() -> renderer.render("font", null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("text");
    }

    @Test
    void shouldNot_render_unknownFont() {
        assertThatThrownBy(() -> renderer.render("unknown", "foo"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Unknown font: unknown");
    }

    @Test
    void should_render_standardBanner() {
        String banner = renderer.render("standard", "test");
        @SuppressWarnings("TextBlockMigration")
        String snapshot = "  _            _   \n" +
                          " | |_ ___  ___| |_ \n" +
                          " | __/ _ \\/ __| __|\n" +
                          " | ||  __/\\__ \\ |_ \n" +
                          "  \\__\\___||___/\\__|\n" +
                          "                   ";
        assertThat(banner)
                .as("banner")
                .isEqualTo(snapshot);
    }

}