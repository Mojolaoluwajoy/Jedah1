package chapter10.exercises.shapes.threeDimensionalShapes;

import chapter10.exercises.shapes.Shapes;
import chapter10.exercises.shapes.Radius;

public class Sphere extends Radius implements Shapes {

    public Sphere(int radius){
        super(radius);
    }
    @Override
    public double area() {
        return 4*Math.PI*getRadius()*getRadius();
    }

    @Override
    public double volume() {
        return (4/3) * Math.PI*getRadius()*getRadius()*getRadius();
    }

    @Override
    public boolean isThreeDimensionalShape() {
        return true;
    }
}
