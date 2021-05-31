package ru.tsedrik.factory.bmw;

import ru.tsedrik.factory.Wheel;
import ru.tsedrik.factory.WheelType;

public class BmwWheel extends Wheel {
    private int size;
    private WheelType type;

    protected BmwWheel(int size, WheelType type) {
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
