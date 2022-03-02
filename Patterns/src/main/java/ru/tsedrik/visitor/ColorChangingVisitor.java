package ru.tsedrik.visitor;

public class ColorChangingVisitor extends Visitor{

    private Color color;

    public ColorChangingVisitor(Color color) {
        super("Color Changing");
        this.color = color;
    }

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.setColor(color);
        System.out.println("Color of rectangle was changed to " + color);
    }

    @Override
    public void visit(Triangle triangle) {
        triangle.setColor(color);
        System.out.println("Color of triangle was changed to " + color);
    }

    @Override
    public void visit(Circle circle) {
        circle.setColor(color);
        System.out.println("Color of circle was changed to " + color);
    }
}
