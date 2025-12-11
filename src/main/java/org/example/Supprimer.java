package org.example;

import java.util.ArrayList;

public class Supprimer {

    // Méthode pour supprimer un client par son ID
    public void supprimerClient(ArrayList<Ajouter> clients, int id) {
        boolean trouve = false;
        for (int i = 0; i < clients.size(); i++) {
            // Vérifie si l'ID correspond
            if (clients.get(i).getId() == id) {
                clients.remove(i);
                System.out.println("Client avec l'ID " + id + " a été supprimé.");
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Client avec l'ID " + id + " introuvable !");
        }
    }
}
