package dev.alexengrig.gradle.spring.banner.figlet;

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
