package Partie1;

public class Connectee extends SocketState {

    public Connectee() {
    }

    public void handleRead(Socket socket) {
        System.out.println("Socket Read");
    }

    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}