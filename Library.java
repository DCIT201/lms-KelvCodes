

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public boolean checkoutBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAvailableCopies() > 0) {
                book.setAvailableCopies(book.getAvailableCopies() - 1);
                patron.borrowBook(book);
                return true;
            }
        }
        return false; // Book not available
    }

    public void returnBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setAvailableCopies(book.getAvailableCopies() + 1);
                patron.returnBook(book);
                break;
            }
        }
    }

    public List<Book> getBooks() {
        return books; // Return the list of books
    }

    public List<Patron> getPatrons() {
        return patrons; // Return the list of patrons
    }
}