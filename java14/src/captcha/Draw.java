package captcha;

public class Draw {
    private String[][] general;
    private final String[] result = new String[9];

    public boolean print(String numSequence) {
        if (!checkElements(numSequence.toCharArray())) {
            System.out.println("You must to input only numbers.Try again:)");
            return false;
        }
        itemSelection(numSequence.toCharArray());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < general.length; j++) {
                System.out.print(general[j][i] + "    ");
            }
            System.out.println();
        }
        return true;
    }


    private boolean checkElements(char[] arr) {
        for (char c : arr) {
            if (c < 48 || c > 57) return false;
        }
        general = new String[arr.length][result.length];
        return true;
    }

    private void itemSelection(char[] numSequence) {
        int i = 0;
        for (char c : numSequence) {
            general[i++] = (select(c));
        }
    }

    private String[] select(char c) {
        Numeral num = new Numeral();
        return switch (c) {
            case '0' -> num.getZero();
            case '1' -> num.getOne();
            case '2' -> num.getTwo();
            case '3' -> num.getThree();
            case '4' -> num.getFour();
            case '5' -> num.getFive();
            case '6' -> num.getSix();
            case '7' -> num.getSeven();
            case '8' -> num.getEight();
            case '9' -> num.getNine();
            default -> new String[0];
        };
    }
}


