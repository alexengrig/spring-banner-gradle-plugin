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

import com.github.dtmo.jfiglet.FigFont;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Objects;

final class LocalFontLoader implements FontLoader {

    private final ClassLoader classLoader = LocalFontLoader.class.getClassLoader();

    @Override
    public boolean hasFont(String font) {
        return FigFontBannerResources.all().contains(font);
    }

    @Override
    public FigFont loadFont(String font) {
        String resource = "fonts/" + font + EXTENSION;
        try (InputStream inputStream = classLoader.getResourceAsStream(resource)) {
            Objects.requireNonNull(inputStream, () -> "inputStream of resource: " + resource);
            return FigFont.loadFigFont(inputStream);
        } catch (IOException e) {
            throw new UncheckedIOException(font, e);
        }
    }

}
