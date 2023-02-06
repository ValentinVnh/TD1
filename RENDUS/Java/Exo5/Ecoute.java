package RENDUS.Java.Exo5;

public class Ecoute extends SocketState {

    public Ecoute() {
    }

    public void handleAccept(Socket socket) {
        socket.setState(new connectee());
        System.out.println("Socket Accept");
    }

    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}