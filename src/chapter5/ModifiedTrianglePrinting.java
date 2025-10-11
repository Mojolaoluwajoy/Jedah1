package chapter5;

public class ModifiedTrianglePrinting {
    public static void main(String[] args) {
             int triangleBase = 5;

        for (int i = 0; i < triangleBase; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.print("                ");

            for (int b=0;b < triangleBase-i;b++) {
                System.out.print("* ");

            }
            System.out.print("                 ");

            for (int y =1; y<=triangleBase-i;y++){
                System.out.print(" ");
            }
            for (int c=0; c< triangleBase -i;c++) {
                System.out.print("* ");
            }
            System.out.print("                        ");
            for (int y=1; y<= triangleBase -i; y++) {
                System.out.print("");
            }
            for (int d= 0; d<= i; d++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }

}


