package ru.tsedrik.factory;

import ru.tsedrik.factory.ford.FordFactory;

public class Main {
    public static void main(String[] args) {

//        CarFactory factory = new VolvoFactory();
//        CarFactory factory = new BmwFactory();
        CarFactory factory = new FordFactory();
        Car car = factory.createCar();
        printCarDescription(car);

    }

    public static void printCarDescription(Car car){
        System.out.println("Создана машина со следующими характеристикаи:");
        System.out.println(car.getBody().getDescription());
        System.out.println(car.getEngine().getDescription());
        System.out.println(car.getSalon().getDescription());
        System.out.println(car.getSuspension().getDescription());
        System.out.println(car.getWheel().getDescription());
    }
}
