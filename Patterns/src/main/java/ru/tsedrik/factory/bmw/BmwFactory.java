package ru.tsedrik.factory.bmw;

import ru.tsedrik.factory.*;

public class BmwFactory extends AbstractCarFactory {

    @Override
    public Body createBody() {
        return new BmwBody("i8", "black", BodyType.COUPE);
    }

    @Override
    public Engine createEngine() {
        return new BmwEngine(700, FuelType.ELECTRICITY);
    }

    @Override
    public Salon createSalon() {
        return new BmwSalon("white", SalonMaterial.LEATHER);
    }

    @Override
    public Suspension createSuspension() {
        return new BmwSuspension(SuspensionStiffness.SPORT);
    }

    @Override
    public Wheel createWheel() {
        return new BmwWheel(21, WheelType.ALLOY);
    }
}
