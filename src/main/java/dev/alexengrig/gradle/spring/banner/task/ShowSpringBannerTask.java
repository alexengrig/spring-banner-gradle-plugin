package dev.alexengrig.gradle.spring.banner.task;

import dev.alexengrig.gradle.spring.banner.SpringBannerExtension;
import dev.alexengrig.gradle.spring.banner.figlet.FigletBannerRenderer;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

import javax.inject.Inject;

/**
 * @since 0.1.0
 */
public class ShowSpringBannerTask extends DefaultTask {

    private static final String NAME = "showBanner";

    private final Project project;
    private final SpringBannerExtension extension;
    private final FigletBannerRenderer renderer;

    /**
     * @since 0.1.0
     */
    @Inject
    public ShowSpringBannerTask(Project project, FigletBannerRenderer renderer) {
        this.project = project;
        this.extension = project.getExtensions().getByType(SpringBannerExtension.class);
        this.renderer = renderer;
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Displays Spring banner.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        var renderer = FigletBannerRenderer.SINGLETON;
        tasks.register(NAME, ShowSpringBannerTask.class, project, renderer);
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void render() {
        String text = extension.getTextValue(project);
        String caption = extension.getCaptionValue();
        String font = extension.getFontValue();
        String banner = renderer.render(font, text);
        if (caption.isBlank()) {
            System.out.println(banner);
        } else {
            String separator = extension.getSeparatorValue();
            System.out.println(banner + separator + caption);
        }
    }

}
