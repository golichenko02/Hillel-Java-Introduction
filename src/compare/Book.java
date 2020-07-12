package compare;

public class Book{
    private Author author;
    private String title;
    private int year;

    public Book( Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            System.out.println("Это одинаковые книги");
            return true;
        }

        if(obj == null || !(obj instanceof Book)){
            return false;
        }

        Book book = (Book) obj;

        if (this.author.equals(book.author)){
            System.out.println("Это книги одного автора.");
             return true;
         }
        return false;
    }


}


