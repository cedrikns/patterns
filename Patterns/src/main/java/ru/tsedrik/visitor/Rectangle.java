package ru.tsedrik.visitor;

public class Rectangle extends Figure{
    private double a;
    private double b;
    private int x;
    private int y;
    private Color color;

    public Rectangle(double a, double b, int x, int y) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.color = Color.RED;
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
