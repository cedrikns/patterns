package ru.tsedrik.factory;

public class Car {
    private Body body;
    private Engine engine;
    private Salon salon;
    private Suspension suspension;
    private Wheel wheel;

    protected Car(Body body, Engine engine, Salon salon, Suspension suspension, Wheel wheel) {
        this.body = body;
        this.engine = engine;
        this.salon = salon;
        this.suspension = suspension;
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Salon getSalon() {
        return salon;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
