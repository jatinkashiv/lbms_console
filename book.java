package LBMS;
import java.util.UUID;

class book
{
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
    
    book(String title,String author)
    {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getId()
    {
       return id; 
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
       return author; 
    }

    public Boolean isBorrowedCheck()
    {
        return isBorrowed;
    }

    public void borrowBook()
    {
        isBorrowed = true;
    }

    public void returnBook()
    {
        isBorrowed = false;
    }
    
    @Override
    public String toString()
    {
        return "BooK ID: " + id + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
    
}