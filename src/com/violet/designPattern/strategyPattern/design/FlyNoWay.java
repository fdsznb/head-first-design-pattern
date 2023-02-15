package com.violet.designPattern.strategyPattern.design;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("FlyNoWay fly()");
    }
}
