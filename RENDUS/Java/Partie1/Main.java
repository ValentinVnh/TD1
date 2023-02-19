package Partie1;

public class Main {
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
