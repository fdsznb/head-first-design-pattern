package com.violet.designPattern.strategyPattern;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered fly()");
    }
}
