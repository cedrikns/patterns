package ru.tsedrik.factory;

import ru.tsedrik.factory.ford.FordFactory;

public class Main {
    public static void main(String[] args) {

//        CarFactory factory = new VolvoFactory();
//        CarFactory factory = new BmwFactory();
        CarFactory factory = new FordFactory();
        createCar(factory);

    }

    public static void createCar(CarFactory factory){
        System.out.println("Создана машина со следующими характеристикаи:");
        Body body = factory.createBody();
        System.out.println(body.getDescription());
        Engine engine = factory.createEngine();
        System.out.println(engine.getDescription());
        Salon salon = factory.createSalon();
        System.out.println(salon.getDescription());
        Suspension suspension = factory.createSuspension();
        System.out.println(suspension.getDescription());
        Wheel wheel = factory.createWheel();
        System.out.println(wheel.getDescription());
    }
}
