package com.violet.designPattern.strategyPattern.design1;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak quack()");
    }
}
