package dev.alexengrig.gradle.spring.banner.task;

import dev.alexengrig.gradle.spring.banner.SpringBannerExtension;
import dev.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * @since 0.1.0
 */
public class GenerateSpringBannerTask extends DefaultTask {

    private static final String NAME = "generateBanner";
    private static final String FILENAME = "banner.txt";

    private final Project project;
    private final SpringBannerExtension extension;
    private final FigletBannerRenderer renderer;

    @Inject
    public GenerateSpringBannerTask(Project project, FigletBannerRenderer renderer) {
        this.project = project;
        this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        this.renderer = renderer;
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Generates '" + FILENAME + "'.");
    }

    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        var renderer = FigletBannerRenderer.SINGLETON;
        var generateTask = tasks.register(NAME, GenerateSpringBannerTask.class, project, renderer);
        Task processResourceTask = tasks.getByName(project.getExtensions()
                .getByType(SourceSetContainer.class)
                .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                .getProcessResourcesTaskName());
        processResourceTask.finalizedBy(generateTask.get());
    }

    @TaskAction
    public void render() {
        Path path = Objects.requireNonNull(project.getExtensions()
                        .getByType(SourceSetContainer.class)
                        .getByName(SourceSet.MAIN_SOURCE_SET_NAME)
                        .getOutput()
                        .getResourcesDir(), "sourceSets.main.resourcesDir")
                .toPath()
                .resolve(FILENAME);
        String text = extension.getTextValue(project);
        String font = extension.getFontValue();
        String banner = renderer.render(font, text);
        String caption = extension.getCaptionValue();
        String separator = extension.getSeparatorValue();
        String result = caption.isBlank()
                ? banner
                : banner + separator + caption;
        try {
            Files.writeString(path, result + separator);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
