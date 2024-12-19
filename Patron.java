

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private List<Book> borrowedBooks; // List of borrowed books

    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks; // Return the list of borrowed books
    }
}