package org.example.ch02;

import org.assertj.core.api.Assertions;
import org.example.ex010302.Apple;
import org.example.ex010302.Color;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Section0201Test {
    static final Logger log = Logger.getLogger(Section0201Test.class.getSimpleName());
    List<Apple> apples = new ArrayList<>();

    @BeforeEach
    void init() {
        log.info("start");
        Collections.addAll(
                apples,
                new Apple(Color.RED, 150),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 150));
    }

    @AfterEach
    void teardown() {
        log.info("teardown");
        apples.clear();
    }

    @Test
    void filterAListOfApplesByRedApplesShouldReturnAListOfSizeTwo() {
        List<Apple> result = Section0201.filterApples(apples, a -> a.color().equals(Color.RED));
        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void filterAListOfApplesByGreenApplesShouldReturnAListOfSizeOne() {
        List<Apple> result = Section0201.filterApples(apples, a -> a.color().equals(Color.GREEN));
        Assertions.assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void filterAListOfApplesByWeightAbove100ApplesShouldReturnAListOfSize2() {
        List<Apple> result = Section0201.filterApples(apples, a -> a.weight() > 100);
        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void filterAListOfApplesByWeightBelowOrEqual100ApplesShouldReturnAListOfSize1() {
        List<Apple> result = Section0201.filterApples(apples, a -> a.weight() <= 100);
        Assertions.assertThat(result.size()).isEqualTo(1);
    }
}