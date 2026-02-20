package chapter11.exercises.rethrownException;

public class Main {
    public static void main(String[] args) {
        try {
            RethrowingExceptions.someMethod();
        }
        catch (Exception e){
            System.out.println("Rethrown exception caught in main");
           e.printStackTrace();
        }
    }
}
