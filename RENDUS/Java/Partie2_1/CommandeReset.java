package Partie2_1;

import java.util.*;

/**
 * 
 */
public class CommandeReset extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeReset(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.reset();
    }
}