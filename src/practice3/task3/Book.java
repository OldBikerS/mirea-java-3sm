package practice3.task3;

public class Book {

    private String author;
    private String name;
    private int year;

    public Book ( String _author , String _name , int _year ) {
        this.author = _author;
        this.name = _name;
        this.year = _year;
    }

    public String getAuthor ( ) {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getYear ( ) {
        return year;
    }

    public void setYear ( int year ) {
        this.year = year;
    }
}