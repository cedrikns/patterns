package ru.tsedrik.factory.bmw;

import ru.tsedrik.factory.Salon;
import ru.tsedrik.factory.SalonMaterial;

public class BmwSalon extends Salon {
    private String color;
    private SalonMaterial material;

    protected BmwSalon(String color, SalonMaterial material) {
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
