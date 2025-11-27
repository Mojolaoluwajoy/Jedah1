package chapter7.exercises;

import java.util.Arrays;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.printf("Error:Please re-enter the command%n" );
        }
        else {
            int[]numbers=new int[args.length];
            for (int index=0;index<args.length;index++){
                numbers[index]=Integer.parseInt((args[index]));
            }
            System.out.println("Parsed numbers: "+(Arrays.toString(numbers)));
             System.out.printf("The average of the minimum and maximum is %d%n", averageOfMinimumAndMaximum(numbers));

            }

        }
    public static int findMaximum(int[] numbers){
        int maximum=numbers[0];
        for (int index=1;index<numbers.length;index++){
        if (numbers[index]> maximum){
       maximum=numbers[index];
}
        }
        System.out.printf("The maximum is %d%n",maximum);

        return maximum;
        }
        public static int findMinimum(int[] numbers){
            int minimum=numbers[0];
            for (int index=1;index<numbers.length;index++){
                if (numbers[index]<minimum){
                    minimum=numbers[index];
                }
            }
            System.out.printf("The minimum is %d%n",minimum);
return minimum;
        }
        public static int averageOfMinimumAndMaximum(int[] numbers){
       int minimum= findMinimum(numbers);
       int maximum= findMaximum(numbers);
       int total =minimum+maximum;
       return total/2;
        }

}
