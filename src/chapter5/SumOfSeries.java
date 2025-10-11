package chapter5;

public class SumOfSeries {
    public static void main(String[] args) {

        long sum =0;
        System.out.println("n\t\tSum");

        for(int n =1; n<=100; n++) {
            sum+=n;
            System.out.println(n+"\t\t"+sum);

        }
    }
}
