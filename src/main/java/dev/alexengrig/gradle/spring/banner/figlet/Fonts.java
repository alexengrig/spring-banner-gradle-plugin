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

package dev.alexengrig.gradle.spring.banner.figlet;

import java.util.HashSet;
import java.util.Set;

/**
 * @since 0.1.0
 */
public final class Fonts {

    private static Set<String> NAMES;

    public static Set<String> all() {
        if (NAMES == null) {
            Set<String> local = FigFontBannerResources.all();
            Set<String> library = LibraryFontLoader.all();
            Set<String> result = new HashSet<>(local.size() + library.size());
            result.addAll(local);
            result.addAll(library);
            NAMES = result;
        }
        return NAMES;
    }

}
