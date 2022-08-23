package dev.alexengrig.gradle.spring.banner;

import dev.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import dev.alexengrig.gradle.spring.banner.figlet.Fonts;
import org.gradle.api.DefaultTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskProvider;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SpringBannerPlugin implements Plugin<Project> {
    private static final FigletBannerRenderer RENDERER = new FigletBannerRenderer();

    @Override
    public void apply(Project project) {
        SpringBannerExtension.create(project);
        project.getTasks().register(ShowBannerTask.NAME, ShowBannerTask.class, project);
        project.getTasks().register(ShowAllBannersTask.NAME, ShowAllBannersTask.class, project);
        TaskProvider<GenerateBannerTask> generate = project.getTasks()
                .register(GenerateBannerTask.NAME, GenerateBannerTask.class, project);
        Task process = project.getTasks()
                .getByName(project.getExtensions()
                        .getByType(SourceSetContainer.class)
                        .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                        .getProcessResourcesTaskName());
        process.finalizedBy(generate.get());
    }

    public static class ShowBannerTask extends DefaultTask {
        private static final String NAME = "showBanner";

        private final Project project;
        private final SpringBannerExtension extension;

        @Inject
        public ShowBannerTask(Project project) {
            this.project = project;
            this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        }

        @TaskAction
        public void render() {
            String text = extension.getText()
                    .convention(project.getName())
                    .get();
            String font = extension.getFont()
                    .convention("standard")
                    .get();
            String caption = extension.getCaption()
                    .convention("Powered by Spring Boot ${spring-boot.version}")
                    .get();
            String banner = RENDERER.render(font, text);
            System.out.println(banner + caption);
        }
    }

    public static class ShowAllBannersTask extends DefaultTask {
        private static final String NAME = "showAllBanners";

        private final Project project;
        private final SpringBannerExtension extension;

        @Inject
        public ShowAllBannersTask(Project project) {
            this.project = project;
            this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        }

        @TaskAction
        public void render() {
            String text = extension.getText()
                    .convention(project.getName())
                    .get();
            String caption = extension.getCaption()
                    .convention("Powered by Spring Boot ${spring-boot.version}")
                    .get();
            for (String font : Fonts.all()) {
                System.out.println("Font: " + font);
                String banner = RENDERER.render(font, text);
                System.out.println(banner + caption);
            }
        }
    }

    public static class GenerateBannerTask extends DefaultTask {
        private static final String NAME = "generateBanner";

        private final Project project;
        private final SpringBannerExtension extension;

        @Inject
        public GenerateBannerTask(Project project) {
            this.project = project;
            this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        }

        @TaskAction
        public void render() {
            String text = extension.getText()
                    .convention(project.getName())
                    .get();
            String font = extension.getFont()
                    .convention("standard")
                    .get();
            String caption = extension.getCaption()
                    .convention("Powered by Spring Boot ${spring-boot.version}")
                    .get();
            String banner = RENDERER.render(font, text);
            String result = banner + caption;
            Path path = project.getExtensions()
                    .getByType(SourceSetContainer.class)
                    .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                    .getOutput()
                    .getResourcesDir()
                    .toPath()
                    .resolve("banner.txt");
            try {
                Files.writeString(path, result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
