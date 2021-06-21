package ru.tsedrik.factory;

public abstract class Salon {

    public abstract String getColor();
    public abstract SalonMaterial getSalonMaterial();

    public String getDescription(){
        return "Цвет салона - " + getColor() + ", материал - " + getSalonMaterial() + ".";
    }
}
