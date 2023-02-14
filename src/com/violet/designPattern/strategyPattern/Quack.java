package com.violet.designPattern.strategyPattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack()");
    }
}
