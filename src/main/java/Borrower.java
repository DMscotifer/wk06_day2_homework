import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> booksOnLoan;

    public Borrower(){
        this.booksOnLoan = new ArrayList<>();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.booksOnLoan.add(book);
    }

}
