package Partie2_1;

/**
 *
 */
public class CommandeConfig extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeConfig(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.configuration();
    }
}

