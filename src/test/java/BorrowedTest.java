import org.junit.Before;

import java.util.ArrayList;

public class BorrowedTest {
    private ArrayList<Book> borrowedBooks;
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before(){
        book1 = new Book("Apt Pupil","Stephen King","Horror/Thriller");
        book2 = new Book("The Outsider","Stephen King","Horror/Thriller");
    }
}
