package org.example.ch02.quiz01;

import org.assertj.core.api.Assertions;
import org.example.ex010302.Apple;
import org.example.ex010302.Color;
import org.junit.jupiter.api.Test;

class AppleFancyFormatterTest {


    @Test
    void shouldReturnWithCharacteristicHeavyAndColorRed() {
        Apple apple = new Apple(Color.RED, 151);
        AppleFancyFormatter appleFancyFormatter = new AppleFancyFormatter();

        Assertions.assertThat(appleFancyFormatter.accept(apple)).isEqualTo("A Heavy RED apple");
    }

    @Test
    void shouldReturnWithCharacteristicLightAndColorRed() {
        Apple apple = new Apple(Color.RED, 101);
        AppleFancyFormatter appleFancyFormatter = new AppleFancyFormatter();

        Assertions.assertThat(appleFancyFormatter.accept(apple)).isEqualTo("A Light RED apple");
    }

    @Test
    void shouldReturnWithCharacteristicHeavyAndColorGreen() {
        Apple apple = new Apple(Color.GREEN, 300);
        AppleFancyFormatter appleFancyFormatter = new AppleFancyFormatter();

        Assertions.assertThat(appleFancyFormatter.accept(apple)).isEqualTo("A Heavy GREEN apple");
    }

    @Test
    void shouldReturnWithCharacteristicLightAndColorGreen() {
        Apple apple = new Apple(Color.GREEN, 1);
        AppleFancyFormatter appleFancyFormatter = new AppleFancyFormatter();

        Assertions.assertThat(appleFancyFormatter.accept(apple)).isEqualTo("A Light GREEN apple");
    }

}