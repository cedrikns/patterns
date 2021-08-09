package ru.tsedrik.visitor;

public class Triangle extends Figure{

    private double a;
    private double b;
    private double c;
    private int x;
    private int y;
    private Color color;

    public Triangle(double a, double b, double c, int x, int y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.y = y;
        this.color = Color.GREEN;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
