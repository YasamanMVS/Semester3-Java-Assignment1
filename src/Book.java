import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;
    private LocalDate borrowDate;

    // Constructor to initialize all the attributes
    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
        this.borrowDate = null;
    }

    // Changes the isBorrowed status to true
    public void borrowBook() {
        this.isBorrowed = true;
        this.borrowDate = LocalDate.now();
    }

    // Changes the isBorrowed status to false
    public void returnBook() {
        this.isBorrowed = false;
        this.borrowDate = null;
    }

    // Prints the details of the book
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Is Borrowed: " + isBorrowed);
        if (isBorrowed) {
            System.out.println("Borrow Date: " + borrowDate);
        }
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isBorrowed=" + isBorrowed +
                ", borrowDate=" + borrowDate +
                '}';
    }
}
