public class Book {
    private String title;
    private String authorName;
    private double price;
    private int publicationYear;

    public Book(String authorName, String title, double price, int publicationYear) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
    }
}