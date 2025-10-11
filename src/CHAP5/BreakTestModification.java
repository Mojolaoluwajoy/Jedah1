package CHAP5;

public class BreakTestModification{
    public static void main(String[] args) {
        int count;

        for (count = 1; count <= 10; count++) {

            if (count == 5) {
                System.out.println("The structural equivalent of break was used to exit this loop.");

            }
            else if (count < 5){
                System.out.printf("%d ", count);
            }

        }
    }
}