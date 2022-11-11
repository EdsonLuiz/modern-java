package org.example.ch02.quiz01;

import org.example.ex010302.Apple;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.weight() > 150 ? "Heavy" : "Light";

        return "A " + characteristic + " " + apple.color() + " apple";
    }
}
