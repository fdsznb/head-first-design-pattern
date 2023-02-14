package com.violet.designPattern.strategyPattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyWithWings fly()");
    }
}
