package interfaces;

public class Movie implements Cloudable {

    @Override
    public void upload(String nameObj) {
        System.out.println("Upload " + nameObj);
    }

    @Override
    public void download(String nameObj) {
        System.out.println("Download " + nameObj);
    }
}
