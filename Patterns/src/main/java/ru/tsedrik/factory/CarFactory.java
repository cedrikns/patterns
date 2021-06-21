package ru.tsedrik.factory;

public interface CarFactory {
    Body createBody();
    Engine createEngine();
    Salon createSalon();
    Suspension createSuspension();
    Wheel createWheel();
}
