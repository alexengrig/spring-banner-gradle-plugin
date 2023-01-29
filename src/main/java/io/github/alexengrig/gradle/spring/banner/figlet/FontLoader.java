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

interface FontLoader {

    String EXTENSION = ".flf";

    static String getFontNameByFilename(String filename) {
        return filename.substring(0, filename.lastIndexOf(EXTENSION));
    }

    static boolean isFontByFilename(String filename) {
        return filename.endsWith(EXTENSION);
    }

    boolean hasFont(String font);

    FigFont loadFont(String font);

}
