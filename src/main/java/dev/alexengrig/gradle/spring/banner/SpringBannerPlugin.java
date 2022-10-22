package dev.alexengrig.gradle.spring.banner;

import dev.alexengrig.gradle.spring.banner.task.GenerateSpringBannerTask;
import dev.alexengrig.gradle.spring.banner.task.ShowAllSpringBannerFontsTask;
import dev.alexengrig.gradle.spring.banner.task.ShowAllSpringBannersTask;
import dev.alexengrig.gradle.spring.banner.task.ShowSpringBannerTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @since 0.1.0
 */
public class SpringBannerPlugin implements Plugin<Project> {

    /**
     * @since 0.1.0
     */
    @Override
    public void apply(Project project) {
        SpringBannerExtension.create(project);
        ShowSpringBannerTask.register(project);
        ShowAllSpringBannersTask.register(project);
        ShowAllSpringBannerFontsTask.register(project);
        GenerateSpringBannerTask.register(project);
    }

}
