package dev.alexengrig.gradle.spring.banner.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String filename = "banner.txt";
        URL url = Main.class.getResource(filename);
        URI uri = Objects.requireNonNull(url, () -> "No " + filename).toURI();
        Path path = Paths.get(uri);
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
    }
}
