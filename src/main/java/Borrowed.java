import java.util.ArrayList;

public class Borrowed {
    private ArrayList<Book> borrowedBooks;
//    private Book book1;

    public Borrowed(){
        borrowedBooks = new ArrayList<Book>();
    }


    public int countBooks() {
        return this.borrowedBooks.size();
    }
}
