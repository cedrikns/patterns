package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.*;

public class FordFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new FordBody("mondeo", "silver", BodyType.UNIVERSAL);
    }

    @Override
    public Engine createEngine() {
        return new FordEngine(115, FuelType.DISEL);
    }

    @Override
    public Salon createSalon() {
        return new FordSalon("grey", SalonMaterial.TEXTILE);
    }

    @Override
    public Suspension createSuspension() {
        return new FordSuspension(SuspensionStiffness.COMFORT);
    }

    @Override
    public Wheel createWheel() {
        return new FordWheel(16, WheelType.STEEL);
    }
}
