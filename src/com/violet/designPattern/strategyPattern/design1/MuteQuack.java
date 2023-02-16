package com.violet.designPattern.strategyPattern.design1;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("MuteQuack quack()");
    }
}
