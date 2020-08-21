package recursion;

public class A_to_B {
    public static void main(String[] args) {
        System.out.println(outputAtoB(8,-1));

    }

    public static String outputAtoB(int a, int b){
       if(a > b){
           if ( a == b){
               return Integer.toString(a);
           }
           else return  a + " " + outputAtoB(a-1,b);
       }
       else {
           if( a == b){
               return Integer.toString(a);
           }
           else return a + " "+  outputAtoB(a + 1,b) ;
       }

    }
}
