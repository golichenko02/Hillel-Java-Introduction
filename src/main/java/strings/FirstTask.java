package strings;

public class FirstTask {
    public static void main(String[] args) {
        String inStr = "Одесса мой город родной";
        int length = inStr.length();
        System.out.println("Длина строки: " + length);

        b(inStr);
    }

    public static void b (String inStr){
        if (inStr.contains("м")){
            char[] arr =  inStr.toCharArray();
            for (int i = inStr.indexOf('м'); i < inStr.indexOf('м')+3; i++){
                System.out.print(arr[i]); // мой
            }
        }
    }
}
