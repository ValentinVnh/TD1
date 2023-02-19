package Partie2_1;

/**
 *
 */
public class CommandeAccept extends CommandeGeneraleSocket {


    /**
     * Default constructor
     */
    public CommandeAccept(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.accept();
    }

    @Override
    public void undo() {
        socket.close();
    }
}