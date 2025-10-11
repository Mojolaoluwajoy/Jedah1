package chapter5;

public class CalculatingTheValueOfPie {
    public static void main(String[] args) {


        double pi = 0;
        int terms = 0;
        int targetTerms = 200000;
        double targetValue = 3.14159;
        double numerator = 4.0;
        int denominator = 1;
        boolean found=false;
        boolean isPositive = true;

        for (int counter =1;counter<=targetTerms; counter++) {
            double term = numerator/denominator;

            pi += isPositive? term:-term;
            isPositive=!isPositive;
            denominator +=2;

            terms++;

            if (!found && Math.abs(pi - targetValue) < 0.00001) {

                System.out.println("Terms needed to reach precision : " +terms);
                found =true;
            }

        }
        System.out.println("Approximated value of pie is:" +pi);

    }
}