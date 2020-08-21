package recursion;

public class NaturalNums {
    public static void main(String[] args) {
        System.out.println(naturalNums(5));

    }

    public static String naturalNums(int n){
        if(n == 1){
            return "1";
        }
        else{
            return naturalNums(n-1) + " " + n;
        }
    }
}
