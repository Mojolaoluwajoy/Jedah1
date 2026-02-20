package chapter11.exercises;

public class OutPutOfCodeSnippet {
    public static void main(String[] args) {
        try {
            String name=null;
            System.out.printf("The length of the string is - %d%n",name.length());
        }
        catch (RuntimeException e){
            System.out.printf("Runtime Exception");
        }
       // catch (NullPointerException e){
        //    System.out.println("Null pointer Exception");
      //  }
    }
}
