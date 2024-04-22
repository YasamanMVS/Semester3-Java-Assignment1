import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Library {
    private Book[] books;
    private int maxBooks;
    private int currentCount;

    // Constructor to initialize the books array and set the maxBooks attribute
    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];
        this.currentCount = 0;
    }

    // Adds a book to the library if there's space
    public boolean addBook(Book book) {
        if (currentCount < maxBooks) {
            books[currentCount] = book;
            currentCount++;
            return true;
        }
        return false;
    }

    // Borrows a book identified by its ISBN
    public boolean borrowBook(String ISBN) {
        for (int i = 0; i < currentCount; i++) {
            if (books[i].getISBN().equals(ISBN) && !books[i].isBorrowed()) {
                books[i].borrowBook();
                return true;
            }
        }
        return false;
    }

    // Returns a borrowed book using its ISBN
    public boolean returnBook(String ISBN) {
        for (int i = 0; i < currentCount; i++) {
            if (books[i].getISBN().equals(ISBN) && books[i].isBorrowed()) {
                books[i].returnBook();
                return true;
            }
        }
        return false;
    }

    // Displays details of all books in the library
    public void displayAllBooks() {
        for (int i = 0; i < currentCount; i++) {
            books[i].displayInfo();
        }
    }

    // Displays books borrowed in the last 7 days
    public void displayBooksBorrowedInLast7Days() {
        LocalDate currentDate = LocalDate.now();
        for (int i = 0; i < currentCount; i++) {
            if (books[i].isBorrowed()) {
                LocalDate borrowDate = books[i].getBorrowDate();
                long daysBetween = ChronoUnit.DAYS.between(borrowDate, currentDate);
                if (daysBetween <= 7) {
                    books[i].displayInfo();
                }
            }
        }
    }

    // Returns a string representation of the object with all the proper information
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library: ").append("Max Books: ").append(maxBooks).append(", Current Count: ").append(currentCount).append("\n");
        for (int i = 0; i < currentCount; i++) {
            sb.append(books[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
