package CHAP5;

public class DiamondPrinting {
    public static void main(String[] args) {

        int x;
        int lenght = 9;
        for (x = 1; x <= lenght; x += 2) {

            for (int y=1; y<= lenght-x;y++) {
                System.out.print(" ");
            }

            for (int y = 1; y <=(2* x-1); y ++) {
                System.out.print("*" );
            }
            System.out.println();
        }


        for ( x=5;x>=1; x-=2){
            for (int j=1; j<= lenght-x;j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*x -1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }}