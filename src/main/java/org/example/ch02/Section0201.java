package org.example.ch02;

import org.example.ex010302.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Section0201 {
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple))
                result.add(apple);
        }

        return result;
    }

    public static void prettyPrintApple(Apple apple, Consumer<Apple> consumer) {
        consumer.accept(apple);
    }
}
