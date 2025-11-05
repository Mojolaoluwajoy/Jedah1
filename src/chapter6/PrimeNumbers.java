package chapter6;

public class PrimeNumbers {

    public  static void isPrime(int number){
        int count=0;
        if (number <=1) {
            System.out.println(number +"number is not prime ");
        }
        for (int i =2;i*i <=number;i++){
            if  (number %i==0 ){
               // System.out.println( number+" is not prime");
                return;
            }
        }
        System.out.println( number+" is definitely prime");

    }

    public static void main(String[] args) {
       // PrimeNumbers prime =new PrimeNumbers();
        int primeCount =0;
        int limit=10000;
        System.out.println("PRIME NUMBERS FROM 1 TO "+limit);
        for (int i=1;i<=limit;i++){

          isPrime(i);

                primeCount++;
        }
        System.out.println("There are "+primeCount+" prime numbers from 1 to "+limit+".");
    }
}
