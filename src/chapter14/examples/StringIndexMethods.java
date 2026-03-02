package chapter14.examples;

public class StringIndexMethods {
    public static void main(String[] args) {
        String letters ="abcdefghijklmabcdefghijklm";
        System.out.printf("'c' is located at index %d%n",letters.indexOf('c'));
 System.out.printf("'a' is located at index %d%n",letters.indexOf('a'));
 System.out.printf("$' is located at index %d%n",letters.indexOf('$'));

     System.out.printf("last 'c' is located at index %d%n",letters.lastIndexOf('c'));
 System.out.printf("last 'a' is located at index %d%n",letters.lastIndexOf('a'));
 System.out.printf("Last '$' is located at index %d%n",letters.lastIndexOf('$'));

        System.out.printf("\"def\" is located at index %d%n",letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d%n",letters.indexOf("def",7));
        System.out.printf("\"Helo\" is located at index %d%n",letters.indexOf("Hello"));

 System.out.printf("Last index of \"def\" is located at index %d%n",letters.lastIndexOf("def"));
        System.out.printf("Last index of \"def\" is located at index %d%n",letters.lastIndexOf("def",25));
        System.out.printf("Last index of \"Helo\" is located at index %d%n",letters.lastIndexOf("Hello"));


    }
}
