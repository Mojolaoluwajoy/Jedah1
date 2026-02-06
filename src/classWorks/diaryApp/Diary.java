package classWorks.diaryApp;
import java.util.Scanner;
public class Diary {
   Scanner mojo =new Scanner(System.in);

    private String lastEntry;
    private String writeEntry;
    private String readEntry;

    public String writeEntry() {
        System.out.println("Enter your diary entry: ");
         lastEntry=mojo.nextLine();
        System.out.println("Saved successfully.");
        System.out.println();
        return writeEntry;
    }
    public void readEntry() {
       if (lastEntry != null){
           System.out.println("Your last entry is: ");
           System.out.println(lastEntry);
           System.out.println();
       }else {
           System.out.print("No entry found!");
           System.out.println();
       }

    }
}
