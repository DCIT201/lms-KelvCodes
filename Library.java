

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String title) {
        return books.removeIf(book -> book.title().equals(title));
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Please there are currently no books available.");
        } else {
            for (Book book : books) {
                System.out.println(book.title());
            }
        }
    }
}
