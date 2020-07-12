package politeh;

public class TestGoods {
    public static void main(String[] args) {
        Goods sklad1 = new Goods(4);
        Goods sklad2 = new Goods(3);

        sklad1.add(new Product("Tovar #1", "Zavod №1", 5,2, 15,5));
        sklad1.add(new Product("Tovar #2", "Zavod №2", 1,3, 25,10));
        sklad1.add(new Product("Tovar #3", "Zavod №3", 2,4, 30,15));

        sklad2.add(new Product("Tovar #2", "Zavod №2", 3,3, 25,10));
        sklad2.add(new Product("Tovar #5", "Zavod №5", 10, 3,20,10));

        System.out.print("Sklad 1 ");
        sklad1.show();
        System.out.print("Sklad 2 ");
        sklad2.show();
        sklad1.showDifference(sklad2); // симметрическая разность множеств sklad1 и sklad2 --> [1,3,5]
        sklad1.profitSorting(); // сортировка товаров по прибыли
        sklad2.profitSorting();
        System.out.print("Sklad 1 ");
        sklad1.show(); //
        System.out.print("Sklad 2 ");
        sklad2.show();

        // оптовая цена больше розничной --> IllegalPriceException
        sklad2.add(new Product("Tovar #6", "Zavod №6", 10, 3,20,30));
        // гарантия меньше 1 --> IllegalGuaranteeException
        sklad1.add(new Product("Tovar #7", "Zavod №7", 10, 0,20,10));

    }
}
