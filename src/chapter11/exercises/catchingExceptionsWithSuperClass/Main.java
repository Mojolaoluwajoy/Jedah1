package chapter11.exercises.catchingExceptionsWithSuperClass;

public class Main {
    public static void main(String[] args) {

        try {


throw new ExceptionA("ExceptionA thrown");
}catch (ExceptionA exceptionA){
            System.out.println("ExceptionA caught");
            exceptionA.printStackTrace();
        }
    }
    }

