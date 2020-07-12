package strings;

public class Laba4 {
    public static void main(String[] args) {
        String s1 = "aleksandr";
        String s2 = "afanasii";
        searchSymb(s1, s2);

        StringBuilder str1 = new StringBuilder("sssbkk");
        StringBuilder str2 = new StringBuilder("sbbbkk");
        searchSymb(str1.toString(), str2.toString());

        String s3 = "eskimo";
        String s4 = "politeh";
        searchSymb(s3,s4);
    }

    private static void searchSymb(String s1, String s2) {
        System.out.println("Первая строка: " + s1);
        System.out.println("Вторая строка: " + s2);

        char chStr1;
        String str1 = "";
        char[] arrS1 = s1.toCharArray();

        for (int i = 0; i < arrS1.length; i++) {
            for (int j = 0; j < arrS1.length; j++) {
                if (arrS1[i] == arrS1[j] && j != i) {
                    chStr1 = arrS1[j];
                    str1 += chStr1;
                    break;
                }
            }
        }
        System.out.println("Первая строка с повторяющимися символами: " + str1);


        char chStr2;
        String str2 = "";
        char[] arrS2 = s2.toCharArray();

        for (int i = 0; i < arrS2.length; i++) {
            for (int j = 0; j < arrS2.length; j++) {
                if (arrS2[i] == arrS2[j] && j != i) {
                    chStr2 = arrS2[j];
                    str2 += chStr2;
                    break;
                }
            }
        }
        System.out.println("Вторая строка с повторяющимися символами: " + str2);


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        String result = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result += arr1[i];
                    break;
                }
            }
        }
        System.out.println("Эти символы повторяются в первой и второй строке, как минимум два раза: " + result + "\n");
    }
}


