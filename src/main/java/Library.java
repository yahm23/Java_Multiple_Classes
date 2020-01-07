import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(){
        collection = new ArrayList<Book>();
        capacity = 50 ;
    }


    public int countBooks() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        this.collection.add(book);
    }

    public int countStock() {
        return this.capacity;
    }
}
