package chapter8.exercises.rationalNumbers;

public class RationalNumbers {
    private int numerator;
    private int denominator;

    public RationalNumbers(int numerator, int denominator) {
      int deductor=gcd(numerator,denominator);
        this.numerator = numerator / deductor;
        this.denominator = denominator / deductor;
    }

    public RationalNumbers() {

    }
    public static int gcd(int numerator,int denominator){
        while (denominator!=0){
            int temporaryStorage=denominator;
            denominator=numerator%denominator;
            numerator=temporaryStorage;
        }
        return numerator;
    }

    public static String addRationalNumbers(int numerator1, int denominator1, int numerator2, int denominator2) {
       int newNumerator=0;
       int newDenominator=0;
       int deductor=0;
        if (denominator1 != denominator2) {
          numerator1=  numerator1*denominator2;
          denominator1=denominator1*denominator2;
          numerator2=numerator2*denominator1;
          denominator2=denominator2*denominator1;
          newNumerator=numerator1+numerator2;
         newDenominator=denominator1;
          deductor=gcd(newNumerator,newDenominator);
          newNumerator/=deductor;
          newDenominator/=deductor;

        }
        else {
            newNumerator=numerator1+numerator2;
            newDenominator=denominator1;
            deductor=gcd(newNumerator,newDenominator);
            newNumerator/=deductor;
            newDenominator/=deductor;

        }
        return String.format("Addition of Rational Numbers:%n%d/%d",newNumerator,newDenominator);
    }
    public static String subtractRationalNumbers(int numerator1, int denominator1, int numerator2, int denominator2) {
       int newNumerator=0;
       int newDenominator=0;
       int deductor;
        if (denominator1 != denominator2) {
          numerator1=  numerator1*denominator2;
          denominator1=denominator1*denominator2;
          numerator2=numerator2*denominator1;
          denominator2=denominator2*denominator1;
         newNumerator=numerator1-numerator2;
         newDenominator=denominator1;
            deductor=gcd(newNumerator,newDenominator);
            newNumerator/=deductor;
            newDenominator/=deductor;

        }
        else {
            newNumerator=numerator1-numerator2;
            newDenominator=denominator1;
            deductor=gcd(newNumerator,newDenominator);
           newNumerator/=deductor;
           newDenominator/=deductor;

        }
        return String.format("Subtraction of Rational Numbers:%n%d/%d",newNumerator,newDenominator);
    }
    public static String multiplyRationalNumbers(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator=numerator1*numerator2;
        int newDenominator=denominator1*denominator2;
       int deductor=gcd(newNumerator,newDenominator);
        newNumerator/=deductor;
        newDenominator/=deductor;


        return String.format("Multiplication of Rational Numbers:%n%d/%d",newNumerator,newDenominator);

    }
    public static String divideRationalNumbers(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator=numerator1*denominator2;
        int newDenominator=denominator1*numerator2;
       int deductor=gcd(newNumerator,newDenominator);
        newNumerator/=deductor;
        newDenominator/=deductor;

        return String.format("Division of Rational Numbers:%n%d/%d",newNumerator,newDenominator);

    }
    public static void toStrings(int numerator,int denominator){
        System.out.printf("Rational Number:%n%d/%d",numerator,denominator);

    }
}