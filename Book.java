public class Book{
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(String title, String author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public String getTitle() {
        return title;
    }
    public String getAuthour(){
        return author;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;   
    }

}