# Library Management System

## Description:
This Java application serves as a basic library management system, enabling the management of book inventories and borrowing processes. It allows users to add books, borrow and return them using their ISBN, and view details about the library's current inventory.

## Features:
- **Add Books**: Users can add books to the library with details such as title, author, and ISBN.
- **Borrow Books**: Books can be borrowed if available, with their status updated in the system.
- **Return Books**: Books can be returned, and their availability is updated.
- **View Books**: All books, whether borrowed or not, can be displayed.
- **Borrowed Books** Tracking: The system can display books that have been borrowed in the last 7 days.

## Technologies Used:
- Java: Main programming language.
- Java LocalDate: For handling dates related to book borrowing.

## Project Structure:
- **`Book.java`**: Defines the book object with properties and methods related to book handling.
- **`Library.java`**: Manages the collection of books and operations such as adding, borrowing, and returning books.
- **`Main.java`**: Entry point of the application that handles user interactions.

## How to Run:
1. **Setup Java Development Kit (JDK)**: Ensure you have the JDK installed on your computer to run Java applications.
2. **Compile the Code**:
   - Open a terminal window in the directory containing the project files.
   - Compile the Java files using the command: `javac Book.java Library.java Main.java`
3. **Run the Application**:
   - In the same terminal window, start the application by typing: `java Main`
   
## Usage:
- **Main Menu**: Once started, the application will present a menu of options:
   - `1`: Add a new book to the library.
   - `2`: Borrow a book using its ISBN.
   - `3`: Return a book using its ISBN.
   - `4`: Display all books in the library.
   - `5`: Display books borrowed within the last 7 days.
   - `6`: Exit the program.  
- **Navigating the Menu**: Enter the number corresponding to your choice and follow the on-screen prompts to perform various operations.
