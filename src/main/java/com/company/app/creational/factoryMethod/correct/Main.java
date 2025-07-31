package com.company.app.creational.factoryMethod.correct;

public class Main {

    public static void main(String[] args) {

        Logistics logistics;

        logistics = new TruckLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();

    }
}
