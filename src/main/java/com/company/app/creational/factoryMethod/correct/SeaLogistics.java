package com.company.app.creational.factoryMethod.correct;

// concrete factory class
public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Sea();
    }
}
