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

    public void addUser(String name)
    {
        user u = new user(name);
        users.add(u);
    }

    public void removeUser(String name)
    {
        for(int i=0;i<users.size();i++)
        {
            user u = users.get(i);
            if(name.equalsIgnoreCase(u.getName()))
            {
                users.remove(u);
            }
        }
    }

    public void showUsers()
    {
        for(int i=0;i<users.size();i++)
        {
            System.out.println(users.get(i).getName());
        }
    }

    public void Borrow(String name, String title)
    {
        user u = null;
        for(int i=0;i<users.size();i++)
        {
            u = users.get(i);
            if(name.equalsIgnoreCase(u.getName()))
            {
                break; 
            }
        }
        book b = null;
        for(int i=0;i<books.size();i++)
        {
            b = books.get(i);
            if(title.equalsIgnoreCase(b.getTitle()))
            {
                break;
            }
        }
        u.borrowBook(b);       
    }

    public void Return(String name, String title)
    {
        user u = null;
        for(int i=0;i<users.size();i++)
        {
            u = users.get(i);
            if(name.equalsIgnoreCase(u.getName()))
            {
                break;
            }
        }
        book b = null;
        for(int i=0;i<books.size();i++)
        {
            b = books.get(i);
            if(title.equalsIgnoreCase(b.getTitle()))
            {
                break;
            }
        }
        u.returnBook(b);
    }

}