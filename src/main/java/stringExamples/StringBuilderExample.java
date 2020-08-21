package stringExamples;

public class StringBuilderExample {
    public static void main(String[] args) {

       StringBuilder stringBuilder = new StringBuilder();// непотоко безопасный
       StringBuffer stringBuffer = new StringBuffer(); // многопоточные приложения

        for (int i = 0; i < 100 ; i++) {
            stringBuilder.append(i);//adding
        }
        stringBuilder.append(" end");
        stringBuilder.append("+");
        stringBuilder.append("==-sd");
        stringBuilder.insert(0,"begin");// вставка
        stringBuilder.charAt(10);
        stringBuilder.replace(10,11,"!");
        String text = stringBuilder.toString();
        System.out.println(stringBuilder.charAt(10));
        System.out.println(text);
    }
}
