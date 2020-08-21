package compare;

public class CompareBooks {
    public static void main(String[] args) {

            Author caverin = new Author("Каверин");
            Author  king = new Author("Стивен Кинг");

            Book greenMile = new Book(king,"Зелёная миля",1996);
            Book shawshank = new Book(king,"Побег из Шоушенка",1994);

            Book twoCaptains = new Book(caverin,"Два капитана", 1940);

            comparing(greenMile,shawshank);
            comparing(greenMile,greenMile);
            comparing(twoCaptains,greenMile);

    }

    public static void prints(Book object,Book obj){
        System.out.println(object.getAuthor().surname + "\t| " + object.getTitle() + "\t| " + object.getYear());
        System.out.println(obj.getAuthor().surname + "\t| " + obj.getTitle() + "\t| " + obj.getYear());
        System.out.println();

    }

    public static void comparing(Book object,Book obj){
        if (object.equals(obj)){
            prints(object,obj);
        }else{
            System.out.println("Эти книги разных авторов");
            prints(object,obj);
        }
    }
}
