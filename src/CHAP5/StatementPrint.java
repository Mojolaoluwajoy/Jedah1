package CHAP5;

public class StatementPrint {
    public static void main(String[] args) {
        int i=2, j=3, k=2,m=2;
        int n=1;
        System.out.println(i == 2);
        System.out.println(j == 5);
        System.out.println((i >=0 ) && (j <= 3));
        System.out.println((m<=100) & (k<=m));
        System.out.println((j>=i)|| (k !=m));
        System.out.println((k+i <j) | (4 - j >= k));
        System.out.println(!(k> j));
    }
}
