package com.violet.designPattern.strategyPattern.design1;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("FlyNoWay fly()");
    }
}
