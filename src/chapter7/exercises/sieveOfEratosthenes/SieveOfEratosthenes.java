package chapter7.exercises.sieveOfEratosthenes;

public class SieveOfEratosthenes {
    private static boolean[] isPrime=new boolean[1000];

    public static void initializeElements(){
        for (int arrayIndex=0;arrayIndex<isPrime.length;arrayIndex++){
            isPrime[arrayIndex]=true;
        }
    }
    public static void sieveOfEratosthenes(){
        initializeElements();
        isPrime[0]=isPrime[1]=false;
        for (int index=2;index*index<isPrime.length;index++){
            if (isPrime[index]){
                for (int index2=index*index;index2<isPrime.length;index2+=index){
                    isPrime[index2]=false;
                }
            }
        }
    }
    public static void displayPrimeNumbers(){
        for (int index=2;index<1000;index++){
            if (isPrime[index]){
                System.out.println(index);
            }
        }
    }

}
