package ru.tsedrik.factory.bmw;

import ru.tsedrik.factory.Engine;
import ru.tsedrik.factory.FuelType;

public class BmwEngine extends Engine {

    private int power;
    private FuelType fuelType;

    protected BmwEngine(int power, FuelType fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    @Override
    public Integer getPower() {
        return power;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }
}
