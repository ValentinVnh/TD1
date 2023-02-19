package Partie2_1;


public class Configuration extends SocketState {

    public Configuration(){

    }

    @Override
    public void handleConfiguration(Socket socket){
        socket.setState(new Connectee());
        System.out.println("Socket connect");
    }
}
