package CHAP5;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        int principal=1000;
        int rate =5;
        int amount = principal;

        System.out.println("Year\tDollar\tCent");

        for (int year=1;year <=10;year++) {
             amount =(int) ((long) amount * (100 + rate)/100);

             int dollars=amount/100;
             int cent = amount % 100;
            System.out.println(year+ "\t\t" +dollars+ "\t\t" +cent);
        }

    }
}



