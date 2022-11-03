package org.example.ex010302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Ex01 {
    static boolean isGreenApple(Apple apple) {
        return Color.GREEN.equals(apple.color());
    }

    static boolean isHeavyApple(Apple apple) {
        return apple.weight() > 150;
    }

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

        System.out.println(filterApples(apples, Ex01::isGreenApple));
        System.out.println();
        System.out.println(filterApples(apples, Ex01::isHeavyApple));
    }
}
