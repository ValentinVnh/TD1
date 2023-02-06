package RENDUS.Java;

public class Main {
    
    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.ecoute();
        System.out.println(socket.getEtat());
        socket.connectee();
        System.out.println(socket.getEtat());
        socket.fermee();
        System.out.println(socket.getEtat());

        System.out.println("-----");

        Socket socket2 = new Socket();
        socket2.ecoute();
        System.out.println(socket2.getEtat());
        socket2.fermee();
        System.out.println(socket2.getEtat());
    }
}
