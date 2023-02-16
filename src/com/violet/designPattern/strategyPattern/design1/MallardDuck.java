package com.violet.designPattern.strategyPattern.design1;


public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    public void display() {
        System.out.println("Mallard Duck display()");
    }
}
