package Partie2_1;

/**
 *
 */
public class Initial extends SocketState {

    /**
     * Default constructor
     */
    public Initial() {
    }

   @Override
    public void handleListen(Socket socket) {
        socket.setState(new Ecoute());
        System.out.println("Socket Listen");
    }

    @Override
    public void handleConnect(Socket socket) {
        socket.setState(new Connectee());
        System.out.println("Socket Connect");
    }

}