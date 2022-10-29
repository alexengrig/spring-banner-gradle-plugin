# spring-banner-gradle-plugin

[![Gradle Plugin Portal](https://img.shields.io/gradle-plugin-portal/v/io.github.alexengrig.spring-banner)](https://plugins.gradle.org/plugin/io.github.alexengrig.spring-banner)
[![GitHub](https://img.shields.io/github/license/alexengrig/spring-banner-gradle-plugin?style=flat&&color=informational)](LICENSE)

[![Github Actions](https://github.com/alexengrig/spring-banner-gradle-plugin/actions/workflows/ci.yml/badge.svg)](https://github.com/alexengrig/spring-banner-gradle-plugin/actions/workflows/ci.yml)

Spring Banner Gradle Plugin for generating `banner.txt`.

```text
                    _                   __                               
   _________  _____(_)___  ____ _      / /_  ____ _____  ____  ___  _____
  / ___/ __ \/ ___/ / __ \/ __ `/_____/ __ \/ __ `/ __ \/ __ \/ _ \/ ___/
 (__  ) /_/ / /  / / / / / /_/ /_____/ /_/ / /_/ / / / / / / /  __/ /    
/____/ .___/_/  /_/_/ /_/\__, /     /_.___/\__,_/_/ /_/_/ /_/\___/_/     
    /_/                 /____/  ____                 __            _     
          ____ __________ _____/ / /__        ____  / /_  ______ _(_)___ 
         / __ `/ ___/ __ `/ __  / / _ \______/ __ \/ / / / / __ `/ / __ \
        / /_/ / /  / /_/ / /_/ / /  __/_____/ /_/ / / /_/ / /_/ / / / / /
        \__, /_/   \__,_/\__,_/_/\___/     / .___/_/\__,_/\__, /_/_/ /_/ 
       /____/                             /_/            /____/          
```

> [See customizing the Spring Banner](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.spring-application.banner)
> .

## Usage

[Add plugin](https://plugins.gradle.org/plugin/io.github.alexengrig.spring-banner),
set `font` and `caption` in your `build.gradle`:

```groovy
springBanner {
    font = 'soft'
    caption = """Version: \${application.version:${project.version}}
Description: \${application.description:${project.description}}"""
}
```

In `caption` use `\${application.version}` for values from Spring and
`${project.version}` for values from Gradle.

## Configuration

Configure in your `build.gradle`:

```groovy
springBanner {
    text = 'Your text for banner' // default - project.name
    separator = '\n' // default - system.lineSeparator
    caption = 'Your text under the banner' // default - 'Powered by Spring Boot v\${spring-boot.version}'
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
