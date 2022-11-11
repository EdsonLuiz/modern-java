package org.example.ch02.quiz01;

import org.example.ex010302.Apple;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.weight() + "g.";
    }
}
