package chapter8.exercises.enhancingClassDate;

public class DateTest {
    public static void main(String[] args) {
        Date date=new Date(12,30,2000);

        for (int index=0;index<10;index++){
            date.nextDay();
            System.out.println("Iteration "+index);
            System.out.println( date.toString());
        }
    }
}
