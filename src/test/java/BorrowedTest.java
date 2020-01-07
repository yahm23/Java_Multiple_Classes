import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class BorrowedTest {
    private Borrowed borrowedBooks;
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before(){
        book1 = new Book("Apt Pupil","Stephen King","Horror/Thriller");
        book2 = new Book("The Outsider","Stephen King","Horror/Thriller");
        library = new Library();
        borrowedBooks = new Borrowed();
    }

    @Test
    public void canCountBookinLists(){
        assertEquals(0,borrowedBooks.countBooks());
    }

//    @Test
//    public void canAddBooktoBorrowed(){
//        borrowedBooks.addBook(book1,library)
//        assertEquals(0,borrowedBooks.countBooks());
//    }

}
