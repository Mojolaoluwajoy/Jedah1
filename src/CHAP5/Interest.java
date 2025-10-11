package CHAP5;

public class Interest {
    public static void main(String[] args) {

        double principal=1000.00;
        double rate =0.5;

        System.out.printf("%s%20s%n","year","Amount on deposit");

        for (int year=1;year <=10;year++) {
            double amount =principal * Math.pow(1.0 + rate,year);
            System.out.printf("%4d%,20.2f%n",year,amount);
        }

    }
}
