package chapter11.exercises.rethrownException;

public class RethrowingExceptions {
    public static void someMethod()throws Exception{
      try {

          someMethod2();
      }
      catch (Exception e){
          System.out.println("Exception caught in someMethod");
          throw new Exception("Exception rethrown in someMethod",e);
      }
    }
    public static void someMethod2() throws Exception{
        throw new Exception("Exception thrown in someMethod2");

    }
}
