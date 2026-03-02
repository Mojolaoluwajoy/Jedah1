package chapter14.examples;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("goodbye");
        String s3 = new String("Happy Birthday");
        String s4 = new String("happy birthday");

        System.out.printf("S1=%s%nS2=%s%nS3=%s%nS4=%s%n%n", s1
                , s2, s3, s4);

        if (s1.equals("hello")) {
            System.out.println("s1 equals \"hello\"");
        } else {
            System.out.println("s1 does not equal  \"hello\"");
        }
if (s1=="hello"){
    System.out.println("s1 is the same object as \"hello\"");
}
else {
    System.out.println("s1 is not the same object as \"hello\"");

}
if (s3.equalsIgnoreCase(s4)){
    System.out.printf("%s equals  %s with case ignored%n",s3,s4);
}
else {
    System.out.printf("%s does not equal  %s%n",s3,s4);
}

        System.out.printf("%ns1.compareTo(s2) is %d",s1.compareTo(s2));
    System.out.printf("%ns2.compareTo(s1) is %d",s2.compareTo(s1));
    System.out.printf("%ns1.compareTo(s1) is %d",s1.compareTo(s1));
    System.out.printf("%ns3.compareTo(s4) is %d",s3.compareTo(s4));
    System.out.printf("%ns4.compareTo(s3) is %d%n%n",s4.compareTo(s3));

    if (s3.regionMatches(0,s4,0,5)){
        System.out.println("First 5 characters of s3 and s4 match");
    }else {
        System.out.println("First 5 characters of s3 and s4 does not match");

    }
    if (s3.regionMatches(true,0,s4,0,5)){
        System.out.println("First 5 characters of s3 and s4 match with case ignored");
    }else {
        System.out.println("First 5 characters of s3 and s4 does not match");

    }

    }
}