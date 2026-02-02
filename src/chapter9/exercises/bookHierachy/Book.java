package chapter9.exercises.bookHierachy;

public class Book {
    private String title;
    private int yearOfPublication;
    private String author;

    public Book(String title,int yearOfPublication,String author){
        this.title=title;
        this.yearOfPublication=yearOfPublication;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %s%n","Book Title",getTitle(),"Year of publication",getYearOfPublication(),"Author",getAuthor());
    }
}
