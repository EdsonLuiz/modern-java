package org.example.ch02;

import org.assertj.core.api.Assertions;
import org.example.ex010302.Apple;
import org.example.ex010302.Color;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Section0201Test {

    @Test
    void filterAListOfApplesByRedApplesShouldReturnAListOfSizeTwo() {
        List<Apple> apples = new ArrayList<>();
        Collections.addAll(
                apples,
                new Apple(Color.RED, 150),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150));
        List<Apple> result = Section0201.filterApples(apples, a -> a.color().equals(Color.RED));
        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void filterAListOfApplesByGreenApplesShouldReturnAListOfSizeOne() {
        List<Apple> apples = new ArrayList<>();
        Collections.addAll(
                apples,
                new Apple(Color.RED, 150),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150));
        List<Apple> result = Section0201.filterApples(apples, a -> a.color().equals(Color.GREEN));
        Assertions.assertThat(result.size()).isEqualTo(1);
    }
}