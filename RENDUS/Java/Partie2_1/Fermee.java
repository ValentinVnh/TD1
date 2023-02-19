package Partie2_1;



public class Fermee extends SocketState {

    public Fermee() {
    }

    @Override
    public void handleReset(Socket socket){
        socket.setState(new Initial());
        System.out.println("Socket Reset");
    }

}