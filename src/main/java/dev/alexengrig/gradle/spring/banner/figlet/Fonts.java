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
