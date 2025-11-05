package chapter6;

public class PerfectNumbers {

    public static boolean isPerfect(int num) {

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum ==num && num >1;
    }

    public static void main(String[] args) {
        PerfectNumbers perfect =new PerfectNumbers();
        for (int i=1;i <=1000;i++){
          if( perfect.isPerfect(i)){
              System.out.println(i+" is perfect number.");
          }
        }
    }
    }
