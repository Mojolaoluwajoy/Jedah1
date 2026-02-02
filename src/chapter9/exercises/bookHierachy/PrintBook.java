package chapter9.exercises.bookHierachy;

public class PrintBook extends Book {
    private String publisher;
    private String ISBN;

    public PrintBook(String title,int yearOfPublication,String author,String publisher,String ISBN){
        super(title,yearOfPublication,author);
        this.publisher=publisher;
        this.ISBN=ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %s%n%s: %s%n%s: %s%n","Book Title",super.getTitle(),"Year of publication",super.getYearOfPublication(),"Author",super.getAuthor(),"Publisher",getPublisher(),"ISBN",getISBN());
    }
}
