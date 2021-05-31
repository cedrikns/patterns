package ru.tsedrik.factory;

public abstract class Suspension {
    public abstract SuspensionStiffness getStiffness();

    public String getDescription(){
        return "Тип подвестки - " + getStiffness() + ".";
    }
}
