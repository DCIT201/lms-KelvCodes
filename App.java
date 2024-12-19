

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
              // Print greeting
        System.out.println(new App().getGreeting());
        // Create a library
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("1984", "George Orwell", 1949);
        book1.setAvailableCopies(3); // Set available copies
        library.addBook(book1);

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        book2.setAvailableCopies(2); // Set available copies
        library.addBook(book2);

        // Register patrons
        Patron patron1 = new Patron("Alice");
        Patron patron2 = new Patron("Bob");
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Simulate borrowing a book
        System.out.println(patron1.getName() + " is trying to borrow '1984': " +
                library.checkoutBook("1984", patron1));

        // Simulate returning a book
        library.returnBook("1984", patron1);
        System.out.println(patron1.getName() + " returned '1984'.");

        // Print borrowed books for each patron
        System.out.println(patron1.getName() + "'s borrowed books: " + patron1.getBorrowedBooks().size());
        
        // Print available copies of '1984'
        System.out.println("Available copies of '1984': " + book1.getAvailableCopies());

        // Print all registered patrons
        System.out.println("Registered Patrons:");
        for (Patron patron : library.getPatrons()) {
            System.out.println("- " + patron.getName());
        }

        // Print all books in the library
        System.out.println("Books in Library:");
        for (Book book : library.getBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (Available Copies: " + book.getAvailableCopies() + ")");
        }
        
  
    }
}