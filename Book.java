

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int availableCopies; // Track available copies

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.availableCopies = 0; // Default to 0 until set explicitly
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getAvailableCopies() {
        return availableCopies; // Getter for available copies
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies; // Setter for available copies
    }
}