
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(Integer capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void removeBook() {
        this.collection.remove(0);
    }

    public void addBookToCapacity(Book book) {
        if (this.bookCount() < this.capacity) {
            this.addBook(book);
        }
    }

}
