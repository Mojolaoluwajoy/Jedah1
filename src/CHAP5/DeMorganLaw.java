package CHAP5;

public class DeMorganLaw {
    public static void main(String[] args) {

        int x= 10;
        int y =5;
        int a=6;
        int b= 8;
        int g=9;
        int i=12;
        int j= 9;
//original statement
        System.out.println(!(x < 5) && !(y >=7));

        System.out.println(!(a == b)|| !(g != 5));

        System.out.println(!(x <= 8)  );


        System.out.println();
    }
}
