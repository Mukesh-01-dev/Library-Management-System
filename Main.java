import exceptions.InvalidBookException;
import models.Book;

public class Main {
    public static void main(String[] args) {
        try {
            Book book1 = new Book("1234567890123", "Computer architecture", "Monnis Mori", "Academics", 20, 15);
            book1.setTotalCopies(25);
        } catch (InvalidBookException IBE) {
            System.out.println("Book is not created");
        }
    }
}
