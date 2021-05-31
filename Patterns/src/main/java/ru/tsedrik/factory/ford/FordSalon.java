package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.Salon;
import ru.tsedrik.factory.SalonMaterial;

public class FordSalon extends Salon {
    private String color;
    private SalonMaterial material;

    protected FordSalon(String color, SalonMaterial material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public SalonMaterial getSalonMaterial() {
        return material;
    }
}
