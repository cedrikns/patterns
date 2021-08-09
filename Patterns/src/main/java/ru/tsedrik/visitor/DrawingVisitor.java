package ru.tsedrik.visitor;

public class DrawingVisitor extends Visitor{

    public DrawingVisitor() {
        super("Drawing");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing rectangle from dot: (" + rectangle.getX() + ", " + rectangle.getY() + ")");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Drawing triangle from dot: (" + triangle.getX() + ", " + triangle.getY() + ")");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing circle from dot: (" + circle.getX() + ", " + circle.getY() + ")");
    }
}
