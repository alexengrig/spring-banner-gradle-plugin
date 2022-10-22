package dev.alexengrig.gradle.spring.banner.figlet;

import com.github.dtmo.jfiglet.FigFont;

interface FontLoader {

    String EXTENSION = ".flf";

    boolean hasFont(String font);

    FigFont loadFont(String font);

}
