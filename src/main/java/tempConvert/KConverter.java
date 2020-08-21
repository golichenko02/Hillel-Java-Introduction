package tempConvert;

public class KConverter  implements Convertable{
    @Override
    public void convert(double value) {
        System.out.println(value + "°C --> "+ (value + 273) + " K");
    }
}
