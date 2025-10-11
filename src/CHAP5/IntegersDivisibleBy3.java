package CHAP5;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
     int sum=0;
        for (int x = 3; x<=30; x+=3) {
            System.out.println(x);
            sum+=x;



        }
        System.out.println("The sum of the numbers divisible by 3 is: " +sum);

    }

}
