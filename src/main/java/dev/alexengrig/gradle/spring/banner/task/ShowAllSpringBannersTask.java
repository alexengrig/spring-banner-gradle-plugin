package dev.alexengrig.gradle.spring.banner.task;

import dev.alexengrig.gradle.spring.banner.SpringBannerExtension;
import dev.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import dev.alexengrig.gradle.spring.banner.figlet.Fonts;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

import javax.inject.Inject;
import java.util.StringJoiner;

/**
 * @since 0.1.0
 */
public class ShowAllSpringBannersTask extends DefaultTask {

    private static final String NAME = "showAllBanners";

    private final Project project;
    private final SpringBannerExtension extension;
    private final FigletBannerRenderer renderer;

    /**
     * @since 0.1.0
     */
    @Inject
    public ShowAllSpringBannersTask(Project project, FigletBannerRenderer renderer) {
        this.project = project;
        this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        this.renderer = renderer;
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Displays all Spring banners.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        var renderer = FigletBannerRenderer.SINGLETON;
        tasks.register(NAME, ShowAllSpringBannersTask.class, project, renderer);
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void display() {
        String text = extension.getTextValue(project);
        String separator = extension.getSeparatorValue();
        StringJoiner joiner = new StringJoiner(separator);
        for (String font : Fonts.all()) {
            joiner
                    .add("Font: " + font)
                    .add(renderer.render(font, text))
                    .add(separator);
        }
        System.out.println(joiner);
    }

}
