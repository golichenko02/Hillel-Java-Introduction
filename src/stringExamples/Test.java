package stringExamples;

public class Test {
    public static void main(String[] args) {
        String x = "Hillel and I";// l
        System.out.println(x.charAt(2));

        String x1 = "Welcome";
        String x2 = " to hillel";
        System.out.println(x1.concat(x2));

        String s = "Welcome to my world";
        System.out.println(s.indexOf("to"));

        System.out.println(s.replace('o', 'X'));//WelcXme tX my wXrld

        System.out.println(s.substring(5,10));

        String str  = "ABCD";

        char[] arr = str.toCharArray();
        for (char c1: arr) {
            System.out.println(c1);
        }

        System.out.println(str.toLowerCase());

        boolean condition = true;

       String result =  String.valueOf(condition);  // -> "true"

    }
}
