package collection_worksheet_2.library_catalog_6;
import java.util.*;

public class LibraryCatalog
{
    private Map<String, Set<Book>> map = new HashMap<>();

    public void addBook(String genre, Book book)
    {
        if(map.containsKey(genre))
        {
            Set<Book> s=map.get(genre);
            s.add(book);
            map.put(genre,s);
        }
        else {
            Set<Book> s = new HashSet<>();
            s.add(book);
            map.put(genre,s);
        }
    }
    public void printBookInGenreSortedOrderByYear(String genre)
    {
        Set<Book> books = map.get(genre);
        if(books==null || books.isEmpty())
        {
            System.out.println("No Books in this genre: "+genre);
            return;
        }
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2)
            {
                if (b1.getYear() > b2.getYear()) return -1;
                else if (b1.getYear() < b2.getYear()) return 1;
                else return 0;
            }
        });

        System.out.println("Books in genre \"" + genre + "\" sorted by year:");
        for (Book b : sortedBooks) {
            System.out.println(b);
        }
    }

}
