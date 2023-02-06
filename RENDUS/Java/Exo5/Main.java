package RENDUS.Java.Exo5;

public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.accept();
        socket.connect();
        socket.close();
    }
}
