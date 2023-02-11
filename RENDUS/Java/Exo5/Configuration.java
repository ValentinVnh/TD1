package RENDUS.Java.Exo5;

public class Configuration extends SocketState {

    public Configuration(){

    }
    
    public void handleConfiguration(Socket socket){
        socket.setState(new Connectee());
        System.out.println("Socket connect");
    }
}
