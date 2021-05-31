package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.Body;
import ru.tsedrik.factory.BodyType;

public class FordBody extends Body {
    private String name;
    private String color;
    private BodyType type;

    protected FordBody(String name, String color, BodyType type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public BodyType getType() {
        return type;
    }
}
