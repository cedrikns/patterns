package ru.tsedrik.factory;

public abstract class Body {

    public abstract String getName();
    public abstract String getColor();
    public abstract BodyType getType();

    public String getDescription(){
        return "Кузов - " + getName() + ", цвет - " + getColor() + ", тип кузова - " + getType() + ".";
    }
}
