/*
 * Copyright 2022-2023 Alexengrig Dev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexengrig.gradle.spring.banner;

import org.junit.jupiter.api.Test;

import static io.github.alexengrig.gradle.spring.banner.SpringBannerExtension.NAME;
import static org.assertj.core.api.Assertions.assertThat;

class SpringBannerExtensionTest {

    @Test
    void should_be_constant_NAME() {
        assertThat(NAME)
                .as("NAME")
                .isEqualTo("springBanner");
    }

}