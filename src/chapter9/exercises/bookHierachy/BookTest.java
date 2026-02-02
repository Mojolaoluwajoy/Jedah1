package chapter9.exercises.bookHierachy;

public class BookTest {
    public static void main(String[] args) {
        PrintBook printBook=new PrintBook("Homeport",2006,"Nora Robert","MJ","ISBN");
        System.out.printf("%s%n%n%s%n","PrintBook Information",printBook);

        AudioBook audioBook=new AudioBook("This woven kingdom",2015,"Tahereh Mafi",15,120,"MJ");
        System.out.printf("%s%n%n%s%n","AudioBook Information",audioBook);
    }
}
