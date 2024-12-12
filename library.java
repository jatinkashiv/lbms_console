package LBMS;
import java.util.ArrayList;
import java.util.List;

public class library {
    private ArrayList<book> books;
    private ArrayList<user> users;

    library()
    {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(String title,String author)
    {
        book b = new book(title,author);
        books.add(b);
    }

    public void removeBook(String title)
    {
        for(int i=0;i<books.size();i++)
        {
            book b = books.get(i);
            if(title.equalsIgnoreCase(b.getTitle()))
            {
                books.remove(b);
            }
            b = null;
        }
    }

    public void showBooks()
    {
        for(int i=0;i<books.size();i++)
        {
            System.out.println(books.get(i));
        }
    }

}
