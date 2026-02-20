package chapter10.exercises.shapes;

public interface Shapes {
    public abstract double area();
    public default double volume(){
        return 0.00;
    }
    public default boolean isThreeDimensionalShape(){
        return false;
    }
}
