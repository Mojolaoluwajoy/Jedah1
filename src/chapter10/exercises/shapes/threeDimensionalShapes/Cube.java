package chapter10.exercises.shapes.threeDimensionalShapes;

import chapter10.exercises.shapes.Shapes;
import chapter10.exercises.shapes.Side;

public class Cube extends Side implements Shapes {

    public Cube(int side){
        super(side);
    }

    @Override
    public double area() {
        return 6*getSide()*getSide();
    }

    @Override
    public double volume() {
        return getSide()*getSide()*getSide();
    }

    @Override
    public boolean isThreeDimensionalShape() {
        return true;
    }
}
