package com.company.app.creational.factoryMethod.correct;

public class Sea implements Transport {

    @Override
    public void deliver() {
        System.out.println("Sea transport deliver the goods");
    }
}
