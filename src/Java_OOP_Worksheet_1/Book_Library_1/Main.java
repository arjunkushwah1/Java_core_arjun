package Java_OOP_Worksheet_1.Book_Library_1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Search for a Book by Title");
            System.out.println("3. Print All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.nextLine();
                    Book book = new Book(title, author, ISBN);
                    if(library.addBook(book))
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.printDetails();
                    }
                    else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("All books in the library:");
                    library.printAllBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();

    }
}