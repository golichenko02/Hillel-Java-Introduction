package BookShelf;

import java.util.ArrayList;

public class BookShelf {
    private int countOfBooks = 0;
    private ArrayList<Book> books = new ArrayList<>();


    public void add(Book book) {

        if (countOfBooks >= 10) {
            System.out.println("You cannot add more than 10 books");

        } else {
            books.add(book);
            countOfBooks++;
        }
    }

    public void showAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i).getName() + " - ");
            System.out.println(books.get(i).getTitle());
        }
    }


}
