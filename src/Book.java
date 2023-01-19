public class Book {

    private int code;
    private String author;
    private Float price;
    private String genre;
    private String title;

    public Book(){}
    public Book(int code, String author, Float price, String genre, String title){
        this.code = code;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getCode() {
        return code;
    }

    public String getAuthor() {
        return author;
    }

    public Float getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }
}
