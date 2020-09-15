package adapter;

public class MeizuCharger implements IChinaSocket {

    @Override
    public void charge() {
        System.out.println("Meizu charging");
    }
}
