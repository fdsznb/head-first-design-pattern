package com.violet.designPattern.strategyPattern.design1;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack()");
    }
}
