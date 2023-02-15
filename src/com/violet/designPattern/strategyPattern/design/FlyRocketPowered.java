package com.violet.designPattern.strategyPattern.design;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered fly()");
    }
}
