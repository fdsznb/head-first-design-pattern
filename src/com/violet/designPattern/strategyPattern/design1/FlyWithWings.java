package com.violet.designPattern.strategyPattern.design1;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyWithWings fly()");
    }
}
