package ru.tsedrik.visitor;

public abstract class Figure {
    public abstract void accept(Visitor visitor);
}
