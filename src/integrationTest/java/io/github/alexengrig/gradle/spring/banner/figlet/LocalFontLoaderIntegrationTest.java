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

import com.github.dtmo.jfiglet.FigFont;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UncheckedIOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LocalFontLoaderIntegrationTest {

    LocalFontLoader loader;

    @BeforeEach
    void setUp() {
        loader = new LocalFontLoader();
    }

    @Test
    void should_has_font() {
        boolean hasFont = loader.hasFont("cola");
        assertThat(hasFont)
                .as("cola font")
                .isTrue();
    }

    @Test
    void should_load_font() {
        FigFont font = loader.loadFont("cola");
        assertThat(font)
                .as("cola font")
                .isNotNull();
    }

    @Test
    void shouldNot_load_nonExistingFont() {
        assertThatThrownBy(() -> loader.loadFont("non-existing-font"), "non existing font")
                .isInstanceOf(NullPointerException.class)
                .hasMessage("Not found font resource: fonts/non-existing-font.flf");
    }

    @Test
    void shouldNot_load_brokenFont() {
        assertThatThrownBy(() -> loader.loadFont("broken-font"), "broken font")
                .isInstanceOf(UncheckedIOException.class)
                .hasMessage("Exception of loading font resource: fonts/broken-font.flf");
    }

}
