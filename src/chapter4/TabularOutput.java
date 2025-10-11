package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
 int x =1;
 System.out.println("N\tN2\tN3\tN4\t");
 while (x <= 5) {

   int N1 =x;
   int N2= x *x;
   int N3 =N1 * N2;
   int N4 = N2 * N2;

   System.out.println(N1+ "\t"+N2+"\t"+N3+"\t"+N4);
   x++;
 }



    }
}

