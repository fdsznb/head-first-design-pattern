package com.violet.designPattern.strategyPattern.design;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak quack()");
    }
}
