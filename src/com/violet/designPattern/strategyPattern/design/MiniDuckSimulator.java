package com.violet.designPattern.strategyPattern.design;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("----------------------");

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();

        System.out.println("-----------------------");

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
