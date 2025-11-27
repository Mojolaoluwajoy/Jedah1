package chapter7.exercises;

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        int number1=76;
        int number2=567;
        int number3=90;
        int number4=70;
        int number5=100;
        System.out.printf("Average of number1 (%d) && number2 (%d) is %d%n ",number1,number2,average(number1,number2));
        System.out.printf("Average of number2 (%d) && number3 (%d) is %d%n ",number2,number3,average(number2,number3));
        System.out.printf("Average of number4 (%d) && number5  (%d) is %d%n ",number4,number5,average(number4,number5));
        System.out.printf("Average of number1 (%d),number4  (%d) && number5 (%d) is %d%n ",number1,number4,number5,average(number1,number4,number5));
        System.out.printf("Average of number1 (%d),number2 (%d),number3 (%d),number4 (%d) && number5 (%d) is %d%n ",number1,number2,number3,number4,number5,average(number1,number2,number3,number4,number5));

    }
    public static int average(int...numbers){
        int total=0;
        for (int index: numbers){
            total+=index;
        }
        return total/numbers.length;
    }
}
