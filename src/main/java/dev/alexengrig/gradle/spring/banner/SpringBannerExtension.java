package dev.alexengrig.gradle.spring.banner;

import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.provider.Property;

/**
 * @since 0.1.0
 */
public interface SpringBannerExtension {

    /**
     * @since 0.1.0
     */
    String NAME = "springBanner";

    /**
     * @since 0.1.0
     */
    static void create(Project project) {
        ExtensionContainer extensions = project.getExtensions();
        extensions.create(NAME, SpringBannerExtension.class);
    }

    /**
     * @since 0.1.0
     */
    Property<String> getText();

    /**
     * @since 0.1.0
     */
    default String getTextValue(Project project) {
        return getText()
                .convention(project.getName())
                .convention("spring")
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getSeparator();

    /**
     * @since 0.1.0
     */
    default String getSeparatorValue() {
        return getSeparator()
                .convention(System.lineSeparator())
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getCaption();

    /**
     * @since 0.1.0
     */
    default String getCaptionValue() {
        return getCaption()
                .convention("Powered by Spring Boot ${spring-boot.version}")
                .get();
    }

    /**
     * @since 0.1.0
     */
    Property<String> getFont();

    /**
     * @since 0.1.0
     */
    default String getFontValue() {
        return getFont()
                .convention("standard")
                .get();
    }

}
