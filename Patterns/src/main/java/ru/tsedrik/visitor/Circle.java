package ru.tsedrik.visitor;

public class Circle extends Figure{

    private double r;
    private int x;
    private int y;
    private Color color;

    public Circle(double r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.color = Color.PURPLE;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getR() {
        return r;
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
