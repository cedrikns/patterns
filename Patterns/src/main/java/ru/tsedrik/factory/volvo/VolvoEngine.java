package ru.tsedrik.factory.volvo;

import ru.tsedrik.factory.Engine;
import ru.tsedrik.factory.FuelType;

public class VolvoEngine extends Engine {

    private int power;
    private FuelType fuelType;

    protected VolvoEngine(int power, FuelType fuelType) {
        this.power = power;
        this.fuelType = fuelType;
        System.out.println("Двигатель c мощностью " + power + "лошадиных сил. Тип топлива: " + fuelType);
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
