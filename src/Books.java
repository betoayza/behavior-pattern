import java.util.ArrayList;

public class Books implements IteratorBook {
    ArrayList<Book> listBooks = new ArrayList<>();
    private int position = 0;

    public void create (Book book) {
        listBooks.add(book);
    }

    @Override
    public Book next() {
        Book book = listBooks.get(position);
        position += 1;
        return book;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public boolean hasMore() {
        return position < listBooks.size();
    }
}
