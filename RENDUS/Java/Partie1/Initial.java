package Partie1;

public class Initial extends SocketState {

    public Initial() {

    }

    public void handleListen(Socket socket) {
        socket.setState(new Ecoute());
        System.out.println("Socket Listen");
    }

    public void handleConnect(Socket socket) {
        socket.setState(new Connectee());
        System.out.println("Socket Connect");
    }

}