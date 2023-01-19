public class Main {

    public static void main (String[] args) {
        Books bookList = new Books();

        bookList.create(new Book(1, "Freddy Kassin", 123.45f, "Horror", "The number 432")); // String code, String author, Float price, String genre
        bookList.create(new Book(2, "Chester Fider", 143.65f, "Scy Fy", "The secret name")); // String code, String author, Float price, String genre
        bookList.create(new Book(3, "Diddo Jantin", 165.43f, "Comedy", "The unchained string")); // String code, String author, Float price, String genre
        bookList.create(new Book(4, "Pepe Rastar", 146.46f, "Drama", "The round number")); // String code, String author, Float price, String genre
        bookList.create(new Book(5, "Pippo Sanchez", 163.15f, "Novel", "The middle entire")); // String code, String author, Float price, String genre

        System.out.println("LISTA DE LIBROS:");
        System.out.println("----------------");
        while(bookList.hasMore()) {
            Book book = bookList.next();
            System.out.println("El titulo es: " + book.getTitle());
        }
        bookList.reset();
    }
}
