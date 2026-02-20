package chapter10.exercises.shapes;

import chapter10.exercises.shapes.threeDimensionalShapes.Cube;
import chapter10.exercises.shapes.threeDimensionalShapes.Sphere;
import chapter10.exercises.shapes.twoDimensionalShapes.Circle;
import chapter10.exercises.shapes.twoDimensionalShapes.Square;
import chapter10.exercises.shapes.twoDimensionalShapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Shapes[] shapes=new Shapes[5];
        shapes[0]=new Circle(11);
        shapes[1]=new Square(15);
        shapes[2]=new Triangle(10,20);
        shapes[3]=new Cube(14);
        shapes[4]=new Sphere(7);


        for (Shapes shape: shapes){
            System.out.printf("for %s%n",shape.getClass().getName());
            if (!shape.isThreeDimensionalShape()){
                System.out.printf("%s%nArea: %.2f%n","This shape is a two dimensional shape",shape.area());
            }
            else {
                System.out.printf("%s%nArea: %.2f%nVolume: %.2f%n","This shape is a three dimensional shape",shape.area(),shape.volume()
                );

            }
        }
    }
}
