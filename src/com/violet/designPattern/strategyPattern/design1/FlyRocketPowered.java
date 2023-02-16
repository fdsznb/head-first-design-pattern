package com.violet.designPattern.strategyPattern.design1;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered fly()");
    }
}
