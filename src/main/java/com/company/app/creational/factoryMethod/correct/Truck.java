package com.company.app.creational.factoryMethod.correct;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Truck deliver the goods");
    }
}
