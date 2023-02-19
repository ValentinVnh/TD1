package Partie2_1;

/**
 *
 */
public class Client {

    public static void main(String[] args) {

        Socket socket;
        Simulateur simulateur;

        simulateur = new Simulateur();
        socket = new Socket();

        simulateur.setCommand("listen", new CommandeListen(socket));
        simulateur.setCommand("accept", new CommandeAccept(socket));
        simulateur.setCommand("connect", new CommandeConnect(socket));
        simulateur.setCommand("config", new CommandeConfig(socket));
        simulateur.setCommand("read", new CommandeRead(socket));
        simulateur.setCommand("close", new CommandeClose(socket));

        simulateur.executeCommande("listen");
        simulateur.executeCommande("accept");
        simulateur.undoCommande("accept");
        simulateur.executeCommande("connect");
        simulateur.executeCommande("config");
        simulateur.executeCommande("read");
        simulateur.executeCommande("close");
    }
}