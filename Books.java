package c4q.nyc.practice.model;

/**
 * Created by c4q on 11/5/17.
 */

public class Books {
    private String title;
    private String author;
    private int year;

    public Books(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
}
