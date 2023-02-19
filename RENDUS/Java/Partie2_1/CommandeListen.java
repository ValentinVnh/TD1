package Partie2_1;

import java.util.*;

/**
 * 
 */
public class CommandeListen extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeListen(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.listen();
    }
}