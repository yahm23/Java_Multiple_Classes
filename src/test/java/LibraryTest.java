import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Apt Pupil","Stephen King","Horror/Thriller");
        book2 = new Book("The Outsider","Stephen King","Horror/Thriller");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0,library.countBooks());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2,library.countBooks());

    }


}
