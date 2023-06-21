package library;

public class Book extends Publication{
    String author;

    public Book(String author,String title,int year){
        super(title,year);
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
