package test_features.textBlocks_patternMatching;

public class Test {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "X", 2018);
        Object obj = new Car("Mercedes", "AMG GT63", 2019);
        System.out.println(tesla.model());
        //obj.model() - нет такого метода, потому что не скастовали
        System.out.println(obj.toString());
        System.out.println(tesla.toString());

        if ( obj instanceof Car){
            System.out.println(((Car) obj).model());
        }

    }
}
