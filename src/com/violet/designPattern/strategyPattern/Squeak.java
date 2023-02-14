package com.violet.designPattern.strategyPattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak quack()");
    }
}