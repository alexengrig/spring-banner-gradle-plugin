package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFont;
import com.github.dtmo.jfiglet.FigFontResources;
import com.github.dtmo.jfiglet.FigletRenderer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FigletBannerRenderer {
    private static final ClassLoader CLASS_LOADER = FigletBannerRenderer.class.getClassLoader();

    private static final String EXTENSION = ".flf";

    private final Set<FontLoader> fontLoaders = Set.of(
            new LibraryFontLoader(),
            new LocalFontLoader()
    );

    public String render(String font, String text) {
        Objects.requireNonNull(font, "font");
        Objects.requireNonNull(text, "text");
        for (FontLoader fontLoader : fontLoaders) {
            if (fontLoader.hasFont(font)) {
                FigFont figFont = fontLoader.loadFont(font);
                final FigletRenderer renderer = new FigletRenderer(figFont);
                return renderer.renderText(text);
            }
        }
        throw new RuntimeException(font);
    }

    private static class LocalFontLoader implements FontLoader {
        private static final String FOLDER = "fonts/";

        @Override
        public boolean hasFont(String font) {
            return FigFontBannerResources.all().contains(font);
        }

        @Override
        public FigFont loadFont(String font) {
            try (InputStream inputStream = CLASS_LOADER.getResourceAsStream(FOLDER + font + EXTENSION)) {
                Objects.requireNonNull(inputStream, "inputStream");
                return FigFont.loadFigFont(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(font, e);
            }
        }
    }

    private static class LibraryFontLoader implements FontLoader {
        private static final Set<String> NAMES;

        static {
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

        public boolean hasFont(String font) {
            return NAMES.contains(font);
        }

        public FigFont loadFont(String font) {
            try {
                return FigFontResources.loadFigFontResource(font + EXTENSION);
            } catch (IOException e) {
                throw new RuntimeException(font, e);
            }
        }
    }
}
