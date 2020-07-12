package stringExamples;

public class DemoArguments {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (String str : args) {
            sb.append(str);
            sb.append(" ; ");
        }

        System.out.println("The passed arguments to the main are: " + sb.toString());
    }
}
