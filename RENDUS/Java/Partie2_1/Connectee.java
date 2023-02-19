package Partie2_1;


public class Connectee extends SocketState {

    public Connectee() {
    }

    @Override
    public void handleRead(Socket socket) {
        System.out.println("Socket Read");
    }

    @Override
    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}