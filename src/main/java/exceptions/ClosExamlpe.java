package exceptions;

import java.io.Closeable;
import java.io.IOException;

public class ClosExamlpe {
    public static void main(String[] args) {
        Test text = new Test();
        try {

            text.run();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class Test implements Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("run method close()");
    }

    public void run() throws IOException{
        throw  new IOException();
    }
}