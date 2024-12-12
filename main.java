package LBMS;

public class main {
    public static void main(String args[])
    {
        System.out.println("LBMS is in Progress");
        book b = new book("Logistics","Richard");
        b.borrowBook();
        System.out.println(b);
    }
}