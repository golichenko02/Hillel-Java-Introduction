package BookShelf;

public class Book extends Author {

    private String title;
    private int numberOfPages;



    public Book(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
