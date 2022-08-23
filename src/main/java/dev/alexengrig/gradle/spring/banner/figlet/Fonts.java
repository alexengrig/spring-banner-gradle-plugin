package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFontResources;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Fonts {
    Set<String> library = Stream.of(
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
            .map(s -> s.substring(0, s.lastIndexOf(".flf")))
            .collect(Collectors.toUnmodifiableSet());

    static Set<String> all() {
        Set<String> local = FigFontBannerResources.all();
        HashSet<String> result = new HashSet<>(local.size() + library.size());
        result.addAll(local);
        result.addAll(library);
        return result;
    }
}
