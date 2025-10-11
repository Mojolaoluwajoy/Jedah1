package CHAP5;

public class CompoundInterestModification {

    public static void main(String[] args) {

        double principal=1000.00;
        double rate;

        System.out.println("year\t\trate\t\tAmount on deposit");

        for (int year=1;year <=10;year++) {

            for (rate =5; rate <= 10; rate++ ) {


                double amount = principal * Math.pow(1.0 + rate, year);

                System.out.println(year+"\t\t"+rate+"\t\t"+amount);
            }
        }

    }
}


