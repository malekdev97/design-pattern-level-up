package com.company.app.creational.factoryMethod.correct;

// concrete factory class
public class TruckLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
