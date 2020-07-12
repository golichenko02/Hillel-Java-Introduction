package recursion;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(65));
    }
    public static int fibonachi(int n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else {
            return fibonachi(n-1)+fibonachi(n-2);
        }
    }
}
