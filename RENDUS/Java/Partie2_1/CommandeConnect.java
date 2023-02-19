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


    public void execute() {
        socket.connect();
    }

}