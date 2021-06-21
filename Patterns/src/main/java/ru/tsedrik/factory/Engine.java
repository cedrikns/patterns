package ru.tsedrik.factory;

public abstract class Engine {

    public abstract Integer getPower();
    public abstract FuelType getFuelType();

    public String getDescription(){
        return "Тип двигателя - " + getFuelType() + ", мощность - " + getPower() + " л.с.";
    }
}
