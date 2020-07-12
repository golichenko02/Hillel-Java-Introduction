package interfaces;

public class GooglePhotoMaker implements Cloudable, Printable{

    @Override
    public void upload(String nameObj) {
        System.out.println("Upload the " + nameObj + " to google cloud");
    }

    @Override
    public void download(String nameObj) {

    }

    @Override
    public void print(String namePicture) {
        System.out.println("Print " + namePicture);
    }
}
