package com.violet.designPattern.strategyPattern;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("FlyNoWay fly()");
    }
}
