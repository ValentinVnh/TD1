package RENDUS.Test;

import RENDUS.Java.Exo5.*;

//import org.junit.jupiter.api.Test;

public class TestSocket {

    //@Test
    public void testSocket(){
        

    }

    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.connect();
        socket.read();
        socket.close();
        socket.reset();
        System.out.println("---");
        socket.listen();
        socket.accept();
        socket.configuration();
        socket.close();
        socket.reset();
    }
    
}
