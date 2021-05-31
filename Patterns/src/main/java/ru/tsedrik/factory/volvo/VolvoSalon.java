package ru.tsedrik.factory.volvo;

import ru.tsedrik.factory.Salon;
import ru.tsedrik.factory.SalonMaterial;

public class VolvoSalon extends Salon {
    private String color;
    private SalonMaterial material;

    protected VolvoSalon(String color, SalonMaterial material) {
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
