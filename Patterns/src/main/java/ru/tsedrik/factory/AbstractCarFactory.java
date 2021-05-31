package ru.tsedrik.factory;

public abstract class AbstractCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        Car car = new Car(createBody(), createEngine(), createSalon(), createSuspension(), createWheel());
        return car;
    }

    protected abstract Body createBody();
    protected abstract Engine createEngine();
    protected abstract Salon createSalon();
    protected abstract Suspension createSuspension();
    protected abstract Wheel createWheel();
}
