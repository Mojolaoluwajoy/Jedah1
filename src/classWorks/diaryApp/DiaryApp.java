package classWorks.diaryApp;

import java.util.Scanner;
public class DiaryApp {
    public static void main(String[] args) {
Scanner mojo =new Scanner(System.in);
        Diary diary=new Diary();
        System.out.println("""
                              =========================
                                   MY SIMPLE DIARY
                              =========================""");

        System.out.println("""
                   1. Write a new entry
                   2. View last entry
                   3. Exit 
                  """);
        while (true){

            System.out.print("Choose an option: ");
            int option = mojo.nextInt();
            mojo.nextLine();
            System.out.println();
            if(option ==1){
           diary.writeEntry();
            }
            else if (option == 2){
            diary.readEntry();
            }
            else{
                System.out.println("Goodbye");
                break;
            }
        }
    }
}
