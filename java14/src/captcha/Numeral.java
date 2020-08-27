package captcha;

public class Numeral {
    private String[] zero;
    private String[] one;
    private String[] two;
    private String[] three;
    private String[] four;
    private String[] five;
    private String[] six;
    private String[] seven;
    private String[] eight;
    private String[] nine;

    public String[] getZero() {
        return """
                 _$$$$_
                _$$__$$
                _$$__$$
                _$$__$$
                _$$__$$
                _$$__$$
                _$$__$$
                _$$__$$
                __$$$$_
                """.split("\n");
    }

    public String[] getOne() {
        return """
                __$$$__
                _$$$$__
                ___$$__
                ___$$__
                ___$$__
                ___$$__
                ___$$__
                ___$$__
                ___$$__
                """.split("\n");
    }

    public String[] getTwo() {
        return """
                 _$$$$_
                _$$__$$
                _____$$
                _____$$
                ____$$_
                ___$$__
                __$$___
                _$$____
                _$$$$$$
                """.split("\n");
    }

    public String[] getThree() {
        return """
                __$$$$_
                _$$__$$
                _____$$
                _____$$
                ___$$$_
                _____$$
                _____$$
                _$$__$$
                __$$$$_
                """.split("\n");
    }

    public String[] getFour() {
        return """
                ____$$_
                ___$$$_
                ___$$$_
                __$$$$_
                __$_$$_
                _$$_$$_
                _$$$$$$
                ____$$_
                ____$$_
                """.split("\n");
    }

    public String[] getFive() {
        return """
                _$$$$$$
                _$$____
                _$$____
                _$$$$$_
                _$$__$$
                _____$$
                _____$$
                _$$__$$
                __$$$$_
                """.split("\n");
    }

    public String[] getSix() {
        return """
                __$$$$_
                _$$__$$
                _$$____
                _$$____
                _$$$$$_
                _$$__$$
                _$$__$$
                _$$__$$
                __$$$$_
                """.split("\n");
    }

    public String[] getSeven() {
        return """
                _$$$$$$
                _____$$
                ____$$_
                ____$$_
                ___$$__
                ___$$__
                __$$___
                __$$___
                __$$___
                """.split("\n");
    }

    public String[] getEight() {
        return """
                __$$$$_
                _$$__$$
                _$$__$$
                _$$__$$
                __$$$$_
                _$$__$$
                _$$__$$
                _$$__$$
                __$$$$_
                """.split("\n");
    }

    public String[] getNine() {
        return """
                __$$$$_
                _$$__$$
                _$$__$$
                _$$__$$
                __$$$$$
                _____$$
                _____$$
                _$$__$$
                __$$$$_       
                """.split("\n");
    }
}

