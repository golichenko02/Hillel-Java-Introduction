package BookShelf;

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf1 = new BookShelf();
        Book book1 = new Book("Stephen King", "Green Mile");
        Book book2 = new Book("Agatha Christie","Ten Little Indians");
        Book book3 = new Book("Arthur Conan Doyle","The Adventures of Sherlock Holmes");
        Book book4 = new Book("Mikhail Bulgakov", "Master and Margarita");
        Book book5 = new Book("Daniel Defo", "Robinson Kruzo");
        Book book6 = new Book("Ilya Ilf, Evgeny Petrov", "Twelve Chairs");
        Book book7 = new Book("Benjamin Caverin", "Two captains");
        Book book8 = new Book("Gabriel  Troepolsky", "White Bim Black Ear");
        Book book9 = new Book("Antoine de Saint-Exupery", "A little prince");
        Book book10 = new Book("Jack London", "White Fang");

        bookShelf1.add(book1);
        bookShelf1.add(book2);
        bookShelf1.add(book3);
        bookShelf1.add(book4);
        bookShelf1.add(book5);
        bookShelf1.add(book6);
        bookShelf1.add(book7);
        bookShelf1.add(book8);
        bookShelf1.add(book9);
        bookShelf1.add(book10);
        bookShelf1.add(book2);// You cannot add more than 10 books
        bookShelf1.showAllBooks();

    }
}
