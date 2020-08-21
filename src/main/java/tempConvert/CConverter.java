package tempConvert;

public class CConverter implements Convertable {

    @Override
    public void convert(double value) {
        System.out.println(value + "°C --> " + value + "°C");
    }
}
