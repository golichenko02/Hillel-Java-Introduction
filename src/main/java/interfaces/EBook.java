package interfaces;

public class EBook implements Printable,Cloudable {

    @Override
    public void upload(String nameObj) {

    }

    @Override
    public void download(String nameObj) {
        System.out.println("download" + nameObj);
    }

    @Override
    public void print(String nameBook) {
        System.out.println("Print " + nameBook + "on mono printer");
    }
}
