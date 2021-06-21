package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.Engine;
import ru.tsedrik.factory.FuelType;

public class FordEngine extends Engine {

    private int power;
    private FuelType fuelType;

    protected FordEngine(int power, FuelType fuelType) {
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
