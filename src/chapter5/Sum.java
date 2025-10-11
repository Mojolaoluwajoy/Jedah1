package chapter5;

public class Sum {
    public static void main(String[] args) {

        int total =0;

        for(int number =2; number <=20;number +=2) {
            total +=number;
        }
        System.out.printf("sum of the even integers from 2 to 20 is :%d%n " ,total);
    }

}
