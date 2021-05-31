package ru.tsedrik.factory;

public abstract class Wheel {
    public abstract Integer getSize();
    public abstract WheelType getWheelType();

    public String getDescription(){
        return "Размер колес - " + getSize() + " дюймов, тип дисков - " + getWheelType() + ".";
    }
}
