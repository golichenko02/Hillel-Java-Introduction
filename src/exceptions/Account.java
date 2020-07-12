package exceptions;

public class Account {
    private String accountId;
    private boolean closed;

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
