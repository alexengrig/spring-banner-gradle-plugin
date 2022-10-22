package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFont;
import com.github.dtmo.jfiglet.FigFontResources;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class LibraryFontLoader implements FontLoader {

    private static Set<String> NAMES;

    public static Set<String> all() {
        if (NAMES == null) {
            NAMES = Stream.of(
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
                            FigFontResources.STANDARD_FLF,
                            FigFontResources.TERM_FLF
                    )
                    .map(s -> s.substring(0, s.lastIndexOf(EXTENSION)))
                    .collect(Collectors.toUnmodifiableSet());
        }
        return NAMES;
    }

    public boolean hasFont(String font) {
        return all().contains(font);
    }

    public FigFont loadFont(String font) {
        try {
            return FigFontResources.loadFigFontResource(font + EXTENSION);
        } catch (IOException e) {
            throw new RuntimeException(font, e);
        }
    }

}
