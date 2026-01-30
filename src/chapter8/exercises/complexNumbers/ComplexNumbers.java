package chapter8.exercises.complexNumbers;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public ComplexNumbers(){

    }
    public  String addTwoComplexNumbers(double realPart1,double imaginaryPart1,double realPart2,double imaginaryPart2){
        double realParts=realPart1+realPart2;
        double imaginaryParts=imaginaryPart1+imaginaryPart2;

        return String.format("ADDITION OF COMPLEX NUMBERS%nReal parts:%.2f%nImaginary parts:%.2f",realParts,imaginaryParts);
    }
    public  String subtractTwoComplexNumbers(double realPart1,double imaginaryPart1,double realPart2,double imaginaryPart2){
        double realParts=realPart1-realPart2;
        double imaginaryParts=imaginaryPart1-imaginaryPart2;

        return String.format("SUBTRACTION OF COMPLEX NUMBERS%nReal parts:%.2f%nImaginary parts:%.2f",realParts,imaginaryParts);
    }
    public void printComplexNumbers(double realPart1,double imaginaryPart1,double realPart2,double imaginaryPart2){
        System.out.printf("COMPLEX NUMBERS%n%10s%20s%n1.%5.2f%20.2f%n2.%5.2f%20.2f","RealPart","ImaginaryPart",realPart1,imaginaryPart1,realPart2,imaginaryPart2);
    }
}
