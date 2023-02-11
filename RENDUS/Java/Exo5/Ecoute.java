package RENDUS.Java.Exo5;

public class Ecoute extends SocketState {

    public Ecoute() {
    }

    public void handleAccept(Socket socket) {
        socket.setState(new Configuration());
        System.out.println("Socket Config");
    }

    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}