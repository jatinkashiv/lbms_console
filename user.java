package LBMS;

class user
{
    String name;
    List<Book> borrowedBooks;
    List<String> borrowedRecords;
    
    User(String name)
    {
        
        this.name = name;
        borrowed = new ArrayList<>();
        BorrowedHistory = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<Book> getBorrowed()
    {
        return borrowedBooks;
    }

    public List<String> getBorrowedHistory()
    {
        return borrowedRecords;
    }

    public void borrowBook(Book book)
    {
        borrowedBooks.add(book);
        book.borrowBook();
        borrowedRecords.add("Book Borrowed " + book.getTitle()+" by "+book.getAuthor());
    }

    public void returnBook(Book book)
    {
        borrowedBooks.remove(book);
        book.returnBook();
        borrowedRecords.add("Book Returned " + book.getTitle()+" by "+book.getAuthor());
    }
}