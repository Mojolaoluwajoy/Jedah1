package chapter8.exercises.rationalNumbers;

public class RationalNumbersTest {
    public static void main(String[] args) {
        int numerator1=5;
        int denominator1=9;
        int numerator2=5;
        int denominator2=1;


        System.out.println(RationalNumbers.addRationalNumbers(numerator1,denominator1,numerator2,denominator2));
        System.out.println( RationalNumbers.subtractRationalNumbers(numerator1,denominator1,numerator2,denominator2));
        System.out.println(RationalNumbers.multiplyRationalNumbers(numerator1,denominator1,numerator2,denominator2));
        System.out.println(RationalNumbers.divideRationalNumbers(numerator1,denominator1,numerator2,denominator2));

   RationalNumbers.toStrings(numerator1,denominator1);
    }
}
