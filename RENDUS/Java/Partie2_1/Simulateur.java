package Partie2_1;

import java.util.*;


public class Simulateur {

    private Map<String, Commande> commandes;


    public Simulateur() {
        commandes = new HashMap<String, Commande>();
    }

    public void setCommand(String nom, Commande commande) {
        commandes.put(nom, commande);
    }

    public void executeCommande(String nom) {
        commandes.get(nom).executer();
    }

    public void undoCommande(String nom) {commandes.get(nom).undo();}

}