package chapter5;

public class ContinueTetModification {
    public static void main(String[] args) {
        for ( int count=1;count <=10; count++) {
            if (count != 5) {
                System.out.println(+count);
                ;
            }
        }
        System.out.println("The structural equivalent of continue was used to skip 5 in this loop.");

    }
}



