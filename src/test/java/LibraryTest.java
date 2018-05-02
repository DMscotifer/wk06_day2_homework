import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book();
        book2 = new Book();
    }

    @Test
    public void bookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToCollection() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void removeBookFromLibrary() {
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void checkCapacityBeforeAddingBooks() {
        library.addBookToCapacity(book);
        library.addBookToCapacity(book2);
        assertEquals(1, library.bookCount());
    }
}
