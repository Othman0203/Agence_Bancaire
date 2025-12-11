package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ajouter> clients = new ArrayList<>();
        int choix;

        do {
            System.out.println("\n--- Menu Agence Bancaire ---");
            System.out.println("1. Ajouter un nouveau client");
            System.out.println("2. Afficher tous les clients");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le saut de ligne

            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez le sexe : ");
                    String sexe = scanner.nextLine();
                    System.out.print("Entrez l'âge : ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consommer le saut de ligne

                    Ajouter client = new Ajouter();
                    client.Ajouter(nom, prenom, sexe, age);
                    clients.add(client);
                }
                case 2 -> {
                    if (clients.isEmpty()) {
                        System.out.println("Aucun client enregistré.");
                    } else {
                        System.out.println("\n--- Liste des clients ---");
                        for (Ajouter client : clients) {
                            client.afficherClient();
                        }
                    }
                }
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        scanner.close();
    }
}
