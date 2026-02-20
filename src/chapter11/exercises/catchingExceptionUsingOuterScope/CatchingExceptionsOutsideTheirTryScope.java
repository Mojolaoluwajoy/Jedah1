package chapter11.exercises.catchingExceptionUsingOuterScope;

public class CatchingExceptionsOutsideTheirTryScope {

    public static void methodA(){
        try {
            String name=null;
            System.out.printf("The numbers of letters present here is- %d%n",name.length());
            System.exit(0);
        }finally {
            System.out.println("This exception will be caught in the next method!");
        }
    }
    public static void methodB() {
        try {
            methodA();
        }
        catch (RuntimeException e){
            System.out.println("Exception caught in method B");
        }
    }

    public static void main(String[] args) {
        methodB();
    }
}
