package com.company.app.creational.factoryMethod.wrong;

public class Logistics {

    void planDelivery() {
        Truck truck = new Truck(); // [X] Logistics is Coupled to Truck
        truck.deliver();
        /** Lets we want to add another method of transportation we need to create another class
         * and put if statement that checks the type of transportation also rewrite the implementation again
         * */
        Sea sea = new Sea();
        sea.deliver();
    }
}
