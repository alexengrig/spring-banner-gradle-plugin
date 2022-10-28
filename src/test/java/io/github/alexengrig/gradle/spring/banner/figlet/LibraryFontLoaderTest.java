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

package io.github.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFontResources;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LibraryFontLoaderTest {

    @Test
    void should_return_fontNames() {
        Set<String> values = LibraryFontLoader.fontNames();
        assertThat(values)
                .as("names")
                .hasSize(17)
                .containsAll(Stream.of(
                                FigFontResources.BANNER_FLF,
                                FigFontResources.BIG_FLF,
                                FigFontResources.BLOCK_FLF,
                                FigFontResources.BUBBLE_FLF,
                                FigFontResources.DIGITAL_FLF,
                                FigFontResources.IVRIT_FLF,
                                FigFontResources.LEAN_FLF,
                                FigFontResources.MINI_FLF,
                                FigFontResources.MNEMONIC_FLF,
                                FigFontResources.SCRIPT_FLF,
                                FigFontResources.SHADOW_FLF,
                                FigFontResources.SLANT_FLF,
                                FigFontResources.SMALL_FLF,
                                FigFontResources.SMSCRIPT_FLF,
                                FigFontResources.SMSHADOW_FLF,
                                FigFontResources.SMSLANT_FLF,
                                FigFontResources.STANDARD_FLF
                        )
                        .map(FontLoader::getFontNameByFilename)
                        .collect(Collectors.toSet()));
    }

}