package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.Wheel;
import ru.tsedrik.factory.WheelType;

public class FordWheel extends Wheel {
    private int size;
    private WheelType type;

    protected FordWheel(int size, WheelType type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public WheelType getWheelType() {
        return type;
    }
}
