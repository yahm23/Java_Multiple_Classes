import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(){
        collection = new ArrayList<Book>();
//        capacity = 1 ;
          capacity = 50 ;
    }


    public int countBooks() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        if(this.stockAvailable()) {
            this.collection.add(book);
            this.capacity -=1;
        }
    }

    public int countStock() {
        return this.capacity;
    }


    public boolean stockAvailable() {
        if(this.capacity >0){
            return true;
        }
        else {return false;}
    }


    public Book removeBook(Book book) {
        if (collection.size() !=0 ){
            collection.remove(book);
            this.capacity +=1;
            return book;
        }
        else {return null;}
    }
}
