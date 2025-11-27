package chapter7.exercises;

public class EnhancedForStatement {
    public static void main(String[] args) {
    if (args.length==0) {
        System.out.println(
                "Error!!No argument was found.");
    }
    else {
        int [] numbers=new int[args.length];
        for (int index=0;index<args.length;index++){
          numbers[index]  =Integer.parseInt(args[index]);
        }
        absoluteValue(numbers);
    }

    }
    public static void absoluteValue(int[] numbers){
        for (int index=0;index<numbers.length;index++){
           int  number=0;
           int absoluteValue=0;
            if (numbers[index] >= 0){
                number=numbers[index];
                absoluteValue=number*1;
                System.out.printf("The absolute value of %d = %d%n",number,absoluteValue);
            } else if (numbers[index]< 0) {
                number=numbers[index];
                absoluteValue=number*-1;
                System.out.printf("The absolute value of %d = %d%n",number,absoluteValue);

            }
        }
    }
}
