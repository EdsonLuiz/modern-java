package org.example.ex010302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Ex02 {

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Collections.addAll(
                apples,
                new Apple(Color.GREEN, 100),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 300),
                new Apple(Color.RED, 300),
                new Apple(Color.GREEN, 200),
                new Apple(Color.RED, 400),
                new Apple(Color.GREEN, 200),
                new Apple(Color.RED, 100),
                new Apple(Color.GREEN, 100)
        );

        System.out.println(filterApples(apples, apple -> Color.GREEN.equals(apple.color())));
        System.out.println();
        System.out.println(filterApples(apples, a -> a.weight() > 150));
        System.out.println();
        System.out.println(filterApples(
                apples,
                a -> a.weight() < 80 || Color.RED.equals(a.color())
        ));
    }
}
