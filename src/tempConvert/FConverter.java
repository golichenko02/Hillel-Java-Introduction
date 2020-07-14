package tempConvert;

public class FConverter implements Convertable {
    @Override
    public void convert(double value) {
        System.out.println(value + "°C --> " + value * 1.8 + 32 + " F");
    }
}
