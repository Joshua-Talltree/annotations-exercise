import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    public List<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>(10);
    }

    /**
     * @deprecated Use publishedBooks instead
     * @return;
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

}
