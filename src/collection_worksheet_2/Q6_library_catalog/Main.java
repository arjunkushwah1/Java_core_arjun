package collection_worksheet_2.Q6_library_catalog;

public class Main
{
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        catalog.addBook("Fantasy", new Book("Harry Potter", "J.K. Rowling", 1997));
        catalog.addBook("Science Fiction", new Book("Dune", "Frank Herbert", 1965));
        catalog.addBook("Science Fiction", new Book("Neuromancer", "William Gibson", 1984));
        catalog.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", 1937)); // Duplicate

        catalog.printBookInGenreSortedOrderByYear("Fantasy");
        System.out.println();
        catalog.printBookInGenreSortedOrderByYear("Science Fiction");
    }
}
