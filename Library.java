import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book>books;
    private List<Patron>patrons;


    public  Library(){
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void registerPatron(Patron patron){
        patrons.add(patron);
    }

    public void lendBook(Book book, Patron patron){
         if(books.contains(book) && !patron.getBorrowedBooks().contains(book)){
    patron.borrowBook(book);
    books.remove(book);
}
 }

 public void returnBook(Book book, Patron patron){
    if(patron.getBorrowedBooks().contains(book)){
        patron.returnBook(book);
        books.add(book);
 }
 }

 public List<Book> getAvailableBooks(){
    return books;}

    public List<Patron> getPatrons() {
        return patrons;}

}