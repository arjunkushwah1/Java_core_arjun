package Java_OOP_Worksheet_1.Book_Library_1;

public class Book
{
    String title ;
    String author;
    String isbn;

    // here we use contructor
    public Book(String title,String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    //Method to Print details of book

    public void printDetails()
    {
        System.out.println("title : "+title);
        System.out.println("author : "+author);
        System.out.println("isbn : "+isbn);
    }

    // Getter for title
     public String getTitle()
     {
         return title;
     }
}
