package com.company.app.creational.factoryMethod.correct;

abstract class Logistics {

    // Factory Method
    protected abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
