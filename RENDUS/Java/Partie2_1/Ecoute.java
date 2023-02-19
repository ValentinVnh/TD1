package Partie2_1;



public class Ecoute extends SocketState {

    public Ecoute() {
    }

    @Override
    public void handleAccept(Socket socket) {
        socket.setState(new Configuration());
        System.out.println("Socket Config");
    }

    @Override
    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}