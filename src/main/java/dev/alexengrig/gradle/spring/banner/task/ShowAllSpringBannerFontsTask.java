package dev.alexengrig.gradle.spring.banner.task;

import dev.alexengrig.gradle.spring.banner.figlet.Fonts;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskContainer;

/**
 * @since 0.1.0
 */
public class ShowAllSpringBannerFontsTask extends DefaultTask {

    private static final String NAME = "showAllBannerFonts";

    /**
     * @since 0.1.0
     */
    public ShowAllSpringBannerFontsTask() {
        setGroup(SpringBannerTasks.GROUP);
        setDescription("Displays all Spring banner fonts.");
    }

    /**
     * @since 0.1.0
     */
    public static void register(Project project) {
        TaskContainer tasks = project.getTasks();
        tasks.register(NAME, ShowAllSpringBannerFontsTask.class);
    }

    /**
     * @since 0.1.0
     */
    @TaskAction
    public void display() {
        System.out.println("Fonts: " + Fonts.all());
    }

}
