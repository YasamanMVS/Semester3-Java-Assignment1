// Yasaman Mirvahabi Sabet
// 101217770
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library myLibrary = new Library(100); // Assuming the library can hold 100 books

        while (true) {
            System.out.println("Welcome to the Library Management System!");
            System.out.println("1. Add a book to the library");
            System.out.println("2. Borrow a book using its ISBN");
            System.out.println("3. Return a book using its ISBN");
            System.out.println("4. Display details of all books");
            System.out.println("5. Display books borrowed in the last 7 days");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a book
                    System.out.println("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter the ISBN of the book: ");
                    String ISBN = scanner.nextLine();
                    myLibrary.addBook(new Book(title, author, ISBN, false));
                    break;

                case 2:
                    // Borrow a book
                    System.out.println("Enter the ISBN of the book you wish to borrow: ");
                    ISBN = scanner.nextLine();
                    myLibrary.borrowBook(ISBN);
                    break;

                case 3:
                    // Return a book
                    System.out.println("Enter the ISBN of the book you wish to return: ");
                    ISBN = scanner.nextLine();
                    myLibrary.returnBook(ISBN);
                    break;

                case 4:
                    // Display all books
                    myLibrary.displayAllBooks();
                    break;

                case 5:
                    // Display books borrowed in the last 7 days
                    myLibrary.displayBooksBorrowedInLast7Days();
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Thank you for using the Library Management System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
