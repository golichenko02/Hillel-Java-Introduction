package adapter;

public class Adapter implements IEuroSocket {
    private IChinaSocket chinaSocket;

    public Adapter(IChinaSocket chinaSocket) {
        this.chinaSocket = chinaSocket;
    }

    @Override
    public void charge() {
        chinaSocket.charge();
    }
}
