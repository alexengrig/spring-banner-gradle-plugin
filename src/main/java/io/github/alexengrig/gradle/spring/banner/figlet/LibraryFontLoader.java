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
import com.github.dtmo.jfiglet.FigFontResources;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Collections;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class LibraryFontLoader implements FontLoader {

    private static SortedSet<String> NAMES;

    private final ClassLoader classLoader = FigFontResources.class.getClassLoader();

    static SortedSet<String> fontNames() {
        if (NAMES == null) {
            Stream<String> stream;
            {
                stream = Stream.of(
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
                );
            }
            TreeSet<String> names = stream
                    .map(FontLoader::getFontNameByFilename)
                    .collect(Collectors.toCollection(TreeSet::new));
            NAMES = Collections.unmodifiableSortedSet(names);
        }
        return NAMES;
    }

    @Override
    public boolean hasFont(String font) {
        return fontNames().contains(font);
    }

    @Override
    public FigFont loadFont(String font) {
        String resource = font + EXTENSION;
        try (InputStream inputStream = classLoader.getResourceAsStream(resource)) {
            Objects.requireNonNull(inputStream, () -> "Not found font resource: " + resource);
            return FigFont.loadFigFont(inputStream);
        } catch (IOException e) {
            throw new UncheckedIOException("Exception of loading font resource: " + resource, e);
        }
    }

}
