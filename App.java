

public class App{
    public String getGreeting(){
        return "Hello and Welcome to This Library Management System";
    }

    public static void main(String[] args) {
         System.out.println(new App().getGreeting());
        Library library = new Library();

        // Creating the books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill  a mockingbird", "Harper Lee",1960);

        //Adding the books to the library
        library.addBook(book1);
        library.addBook(book2);

        //Creating a Patron
        Patron patron = new Patron("John Doe");

        // Registering the Patron
        library.registerPatron(patron);

        //Lending a book to the Patron
        library.lendBook(book1, patron);

        //Showing available books
        System.out.println("Available books:");
        for (Book book :library.getAvailableBooks()){
            System.out.println(book.getTitle());
        }

        //Showing borrowed books
        System.out.println("Books borrowed by: " + patron.getName() + ":");
        for(Book book : patron.getBorrowedBooks()){
            System.out.println(book.getTitle());
        }
        
        // Returning a book
        library.returnBook(book1, patron);

        //Final available books after returning
        System.out.println("Available books after returning: ");
        for(Book book: library.getAvailableBooks()){
            System.out.println(book.getTitle());
        }

       
    }
}



