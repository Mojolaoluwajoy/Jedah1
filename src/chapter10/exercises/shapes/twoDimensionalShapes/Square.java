package chapter10.exercises.shapes.twoDimensionalShapes;

import chapter10.exercises.shapes.Shapes;
import chapter10.exercises.shapes.Side;

public class Square extends Side implements Shapes {

public Square(int side){
    super(side);
}
    @Override
    public double area() {
        return getSide()*getSide();
    }
}
