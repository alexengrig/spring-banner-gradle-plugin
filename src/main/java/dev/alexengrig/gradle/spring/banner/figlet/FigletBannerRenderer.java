package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFont;
import com.github.dtmo.jfiglet.FigletRenderer;

import java.util.Objects;
import java.util.Set;

/**
 * @since 0.1.0
 */
public final class FigletBannerRenderer {

    public static FigletBannerRenderer SINGLETON = new FigletBannerRenderer();

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

}
