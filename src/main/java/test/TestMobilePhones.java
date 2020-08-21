package test;

public class TestMobilePhones {
    private enum Phones {
        RED(250), GOLD(200), SILVER(150), WHITE(100);

        private int price;

        Phones(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Phones redPhone = Phones.RED;

        Phones goldPhone = Phones.GOLD;

        Phones anotherModel = Phones.SILVER;

        Phones whitePhone = Phones.WHITE;

        System.out.println(redPhone.getPrice());
    }
}
