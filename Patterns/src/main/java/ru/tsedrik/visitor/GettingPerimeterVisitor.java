package ru.tsedrik.visitor;

public class GettingPerimeterVisitor extends Visitor{

    public GettingPerimeterVisitor() {
        super("Getting Perimeter");
    }

    @Override
    public void visit(Rectangle rectangle) {
        double p = rectangle.getA() * 2 +  rectangle.getB() * 2;
        System.out.println("Perimeter of rectangle: " + p);
    }

    @Override
    public void visit(Triangle triangle) {
        double p = triangle.getA() + triangle.getB() + triangle.getC();
        System.out.println("Perimeter of triangle: " + p);
    }

    @Override
    public void visit(Circle circle) {
        double p = 2 * Math.PI * circle.getR();
        System.out.println("Perimeter of circle: " + p);
    }
}
