package chapter10.exercises.shapes.twoDimensionalShapes;

import chapter10.exercises.shapes.Shapes;
import chapter10.exercises.shapes.Radius;

public class Circle extends Radius implements Shapes {

    public Circle(int radius){
        super(radius);
    }

    @Override
    public double area() {
        return  Math.PI * getRadius()*getRadius();
    }
}
