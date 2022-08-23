package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFont;

public interface FontLoader {
    boolean hasFont(String font);

    FigFont loadFont(String font);
}
