package ru.tsedrik.visitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = Arrays.asList(new Rectangle(2, 4, 3, 3), new Triangle(3, 2, 4, 3, 3), new Circle(3, 3, 3));

        List<Visitor> visitors = Arrays.asList(new GettingPerimeterVisitor(),
                new GettingAreaVisitor(),
                new ColorChangingVisitor(Color.BLUE),
                new DrawingVisitor());

        for (Figure f : figures){
            for (Visitor v : visitors) {
                f.accept(v);
            }
        }
    }
}
