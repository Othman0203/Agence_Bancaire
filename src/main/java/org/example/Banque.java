package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Ajouter;
import org.example.Compte;
public class Banque {
    private ArrayList<Compte> comptes = new ArrayList<>();

    // Ajouter un compte
    public void ajouterCompte(Compte compte) {
        comptes.add(compte);
    }

    // Modifier un compte
    public void modifierCompte(int id, String nouveauNom) {
        for (Compte c : comptes) {
            if (c.getId() == id) {
                c.setNom(nouveauNom);
                System.out.println("Compte modifié : " + c);
                return;
            }
        }
        System.out.println("Compte introuvable !");
    }

    // Afficher tous les comptes
    public void afficherComptes() {
        for (Compte c : comptes) {
            System.out.println(c);
        }
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banque banque = new Banque();

        // Ajouter des comptes
        banque.ajouterCompte(new Compte(1, "Othman", 1000));
        banque.ajouterCompte(new Compte(2, "Kouther", 2000));

        // Afficher avant modification
        System.out.println("Avant modification :");
        banque.afficherComptes();

        // Modifier un compte
        System.out.print("Entrez l'ID du compte à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consommer le saut de ligne
        System.out.print("Entrez le nouveau nom: ");
        String nouveauNom = scanner.nextLine();

        banque.modifierCompte(id, nouveauNom);

        // Afficher après modification
        System.out.println("Après modification :");
        banque.afficherComptes();

        scanner.close();
    }
}
