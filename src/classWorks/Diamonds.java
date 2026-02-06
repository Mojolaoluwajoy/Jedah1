package classWorks;

public class Diamonds {
    public static void main(String[] args) {

int row=5;
int x=1;
        for (int a =1;a<=row;a++) {

            for (int b = 0; b <row- a; b++) {
                System.out.print(" ");
            }

                for (int c=1;c<=x;c++) {

                    System.out.print("*");
                }
                x+=2;
            System.out.println();
        }
        row=4;
        int start=7;
        int d=7;

        for (int a =0;a<=4;a++){
            for (int b =0;b<a+1 ;b++){
                System.out.print(" ");
            }
for (int c =d;c>=1;c--){
    System.out.print("*");
}
    d-=2;
            System.out.println();

        }

    }


    
}
