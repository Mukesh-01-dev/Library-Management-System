package models;
import exceptions.InvalidBookException;

public class Book {
    private String isbn; 
    private String title;
    private String author;
    private String category;
    private int totalCopies;
    private int availableCopies;

    public Book(String isbn, String title, String author, String category, int totalCopies, int availableCopies) {
        validate(isbn, title, author, totalCopies,availableCopies);
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    private void validate(String isbn, String title, String author, int totalCopies, int availableCopies) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidBookException("ISBN cannot be null");
        }
        if (isbn.length() != 13 || !isbn.matches("\\d+")) {
            throw new InvalidBookException("ISBN must be exactly 13 digits");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidBookException("Title cannot be null or empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new InvalidBookException("Author name cannot be null or empty");
        }
        if (availableCopies < 0) {
            throw new InvalidBookException("Available copies cannot be less than zero");
        }
    }

    public String getBookId() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public int getTotalCopies() {
        return totalCopies;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }
    // public void getDetails() {
    //     System.err.println(isbn + title + author + category + totalCopies + availableCopies); 
    // }
}   