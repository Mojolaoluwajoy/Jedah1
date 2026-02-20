package chapter10.exercises.shapes.twoDimensionalShapes;

import chapter10.exercises.shapes.Shapes;

public class Triangle implements Shapes {
    private int base;
    private int height;

    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5*getBase()*getHeight();
    }
}

