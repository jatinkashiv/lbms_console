package LBMS;
import java.util.ArrayList;
import java.util.List;

class user
{
    String name;
    List<book> borrowedBooks;
    List<String> borrowedRecords;
    
    user(String name)
    {
        
        this.name = name;
        borrowedBooks = new ArrayList<>();
        borrowedRecords = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<book> getBorrowed()
    {
        return borrowedBooks;
    }

    public List<String> getBorrowedHistory()
    {
        return borrowedRecords;
    }

    public void borrowBook(book book)
    {
        borrowedBooks.add(book);
        book.borrowBook();
        borrowedRecords.add("Book Borrowed " + book.getTitle()+" by "+book.getAuthor());
    }

    public void returnBook(book book)
    {
        borrowedBooks.remove(book);
        book.returnBook();
        borrowedRecords.add("Book Returned " + book.getTitle()+" by "+book.getAuthor());
    }
}