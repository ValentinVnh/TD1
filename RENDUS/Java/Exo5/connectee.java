package RENDUS.Java.Exo5;

public class connectee extends SocketState {

    public connectee() {
    }

    public void handleRead(Socket socket) {
        System.out.println("Socket Read");
    }

    public void handleClose(Socket socket) {
        socket.setState(new Fermee());
        System.out.println("Socket Close");
    }

}