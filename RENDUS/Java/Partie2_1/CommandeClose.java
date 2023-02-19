package Partie2_1;

/**
 *
 */
public class CommandeClose extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeClose(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.close();
    }

    @Override
    public void undo() {
        socket.listen();
    }
}