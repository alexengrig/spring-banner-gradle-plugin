# spring-banner-gradle-plugin

[![Java CI with Gradle](https://github.com/alexengrig/spring-banner-gradle-plugin/actions/workflows/gradle.yml/badge.svg)](https://github.com/alexengrig/spring-banner-gradle-plugin/actions/workflows/gradle.yml)

Spring Banner Gradle Plugin for generating `banner.txt`.

```text
                 _                   _                                 
  ___ _ __  _ __(_)_ __   __ _      | |__   __ _ _ __  _ __   ___ _ __ 
 / __| '_ \| '__| | '_ \ / _` |_____| '_ \ / _` | '_ \| '_ \ / _ \ '__|
 \__ \ |_) | |  | | | | | (_| |_____| |_) | (_| | | | | | | |  __/ |   
 |___/ .__/|_|  |_|_| |_|\__, |     |_.__/ \__,_|_| |_|_| |_|\___|_|   
     |_|                 |___/                                         
```

> [See customizing the Spring Banner](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.spring-application.banner)
> .

## Usage

Add in your `build.gradle`:

```groovy
plugins {
    id 'dev.alexengrig.spring-banner' version '0.1.0'
}
```

Use `${project.version}` for values from Gradle and
`\${application.description}` for values from Spring
in your `build.gradle`:

```groovy
springBanner {
    font = 'soft'
    caption = """
Version: ${project.version}
Description: \${application.description}
"""
}
```

## Configuration

Configure in your `build.gradle`:

```groovy
springBanner {
    text = 'Your text for banner' // default - project.name
    separator = '\n' // default - system.lineSeparator
    caption = 'Your text under the banner' // default - 'Powered by Spring Boot \${spring-boot.version}'
    font = 'Some font' // default - 'standard'
}
```

## Tasks

```
Spring banner tasks
-------------------
generateBanner - Generates 'banner.txt'.
showAllBannerFonts - Displays all Spring banner fonts.
showAllBanners - Displays all Spring banners.
showBanner - Displays Spring banner.
```

## Alternatives

- [Spring Banner Maven Plugin](https://github.com/acanda/spring-banner-plugin)
- [Online Spring Boot Banner Generator](https://devops.datenkollektiv.de/banner.txt/index.html)

## License

This project is [licensed](LICENSE) under
[Apache License, version 2.0](https://www.apache.org/licenses/LICENSE-2.0).
