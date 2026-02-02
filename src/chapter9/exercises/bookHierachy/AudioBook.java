package chapter9.exercises.bookHierachy;

public class AudioBook extends Book {
    private int bookSize;
    private int playLength;
    private String playBackArtist;

    public AudioBook(String title, int yearOfPublication, String author, int bookSize, int playLength, String playBackArtist){
        super(title, yearOfPublication,author);
        this.bookSize=bookSize;
        this.playLength=playLength;
        this.playBackArtist=playBackArtist;
    }

    public int getBookSize() {
        return bookSize;
    }

    public int getPlayLength() {
        return playLength;
    }

    public String getPlayBackArtist() {
        return playBackArtist;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %s%n%s: %dMB%n%s: %dMinutes%n%s: %s%n","Book Title",getTitle(),"Year of publication",getYearOfPublication(),"Author",getAuthor(),"Book Size",getBookSize(),"Play length",getPlayLength(),"Play back Artist",getPlayBackArtist());
    }
}
