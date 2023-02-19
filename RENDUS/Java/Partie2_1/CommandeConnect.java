package Partie2_1;

import java.util.*;

/**
 * 
 */
public class CommandeConnect extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeConnect(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.connect();
    }

    @Override
    public void undo() {
        socket.configuration();
    }

}