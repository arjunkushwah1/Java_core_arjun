package Java_OOP_Worksheet_1.Book_Library_1;

import java.util.ArrayList;

public class Library
{

    private ArrayList<Book> books;

    // Constructor
    public Library()
    {
        books = new ArrayList<>();
    }

    //method to add a book to the  library
    public boolean  addBook(Book book)
    {

        if(isTitleExists(book.getTitle()))
        {
            System.out.println("book already present");
            return false ;
        }
        else {
            books.add(book);
            return true;
        }

    }

    private boolean isTitleExists( String t)
    {

        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(t))
            {
                return true;
            }
        }
        return false;
    }
    //method to Search book in library by title
    public Book searchByTitle( String t)
    {

        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(t))
            {
                return book;
            }
        }
        return null;
    }


    // Method to print all books in the library
     public void printAllBooks()
     {
         for (Book book : books)
         {
             book.printDetails();
             System.out.println();
         }
    }


}
