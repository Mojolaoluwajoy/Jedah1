package chapter8.exercises.cylinderVolume;
import static java.lang.Math.PI;
public class Cylinder {
    private double radius=1;
    private double height=1;

    public Cylinder(double radius,double height){
      this.radius=radius;
      this.height=height;
    }
    public double cylinderVolume(){
        return PI * (getRadius() * getRadius())*getHeight();

    }

public void setRadius(double radius) {
    if (radius >= 0) {
        this.radius = radius;
    }else {
        throw new IllegalArgumentException("The value(s) provided is/are out of range");
    }
}
    public double getRadius() {
        return radius;
    }

    public void setHeight(double height){
        if(height >=0){
    this.height= height;
}else {
            throw new IllegalArgumentException("the value(s) provided is/are out of range");
        }

    }

    public double getHeight() {
        return height;
    }
}
