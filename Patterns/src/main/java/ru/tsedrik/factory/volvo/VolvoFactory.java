package ru.tsedrik.factory.volvo;

import ru.tsedrik.factory.*;

public class VolvoFactory extends AbstractCarFactory {

    @Override
    public Body createBody() {
        return new VolvoBody("xc90", "white", BodyType.SUV);
    }

    @Override
    public Engine createEngine() {
        return new VolvoEngine(250, FuelType.PETROL);
    }

    @Override
    public Salon createSalon() {
        return new VolvoSalon("black", SalonMaterial.ALCANTARA);
    }

    @Override
    public Suspension createSuspension() {
        return new VolvoSuspension(SuspensionStiffness.STANDART);
    }

    @Override
    public Wheel createWheel() {
        return new VolvoWheel(18, WheelType.ALLOY);
    }
}
