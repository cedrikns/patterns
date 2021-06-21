package ru.tsedrik.factory.volvo;

import ru.tsedrik.factory.Wheel;
import ru.tsedrik.factory.WheelType;

public class VolvoWheel extends Wheel {
    private int size;
    private WheelType type;

    protected VolvoWheel(int size, WheelType type) {
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
