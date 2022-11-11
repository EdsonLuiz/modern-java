package org.example.ch02.quiz01;

import org.assertj.core.api.Assertions;
import org.example.ex010302.Apple;
import org.example.ex010302.Color;
import org.junit.jupiter.api.Test;

class AppleSimpleFormatterTest {

    @Test
    void shouldShowSimpleMessageForAppleWith151g() {
        AppleSimpleFormatter appleSimpleFormatter = new AppleSimpleFormatter();
        Apple apple = new Apple(Color.RED, 151);

        Assertions.assertThat(appleSimpleFormatter.accept(apple)).isEqualTo("An apple of 151g.");
    }

    @Test
    void shouldShowSimpleMessageForAppleWith2g() {
        AppleSimpleFormatter appleSimpleFormatter = new AppleSimpleFormatter();
        Apple apple = new Apple(Color.RED, 2);

        Assertions.assertThat(appleSimpleFormatter.accept(apple)).isEqualTo("An apple of 2g.");
    }
}