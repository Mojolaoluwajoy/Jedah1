package chapter8.exercises.dateAndTimeClass;

public class EnhancementTest {
    public static void main(String[] args) {

   Time2 time2=new Time2(23,59,59);

        System.out.println(time2.toString());
        System.out.println(time2.toUniversalString());


        time2.tick();

        System.out.println();
           System.out.println(time2.toString());
            System.out.println(time2.toUniversalString());
         }
}