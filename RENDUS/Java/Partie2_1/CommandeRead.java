package Partie2_1;

import java.util.*;

/**
 * 
 */
public class CommandeRead extends CommandeGeneraleSocket {

    /**
     * Default constructor
     */
    public CommandeRead(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void executer() {
        socket.read();
    }
}