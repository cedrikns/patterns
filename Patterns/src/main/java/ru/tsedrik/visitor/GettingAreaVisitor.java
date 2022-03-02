package ru.tsedrik.visitor;

public class GettingAreaVisitor extends Visitor{

    public GettingAreaVisitor() {
        super("Getting Area");
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getA() * rectangle.getB();
        System.out.println("Area of rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        double area = Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
        System.out.println("Area of triangle: " + area);
    }

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getR(), 2);
        System.out.println("Area of circle: " + area);
    }
}
