package RENDUS.Java.Partie2;

public class Fermee extends SocketState {

    public Fermee() {
    }

    public void handleReset(Socket socket){
        socket.setState(new Initial());
        System.out.println("Socket Reset");
    }

}