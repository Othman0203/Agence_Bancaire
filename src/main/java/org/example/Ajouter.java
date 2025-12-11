package org.example;

public class Ajouter {
    private static int compteurId = 1; // pour générer un ID unique automatiquement
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private int age;

    // Méthode pour ajouter un client
    public void Ajouter(String nom, String prenom, String sexe, int age) {
        this.id = compteurId++; // attribuer un ID unique automatiquement
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;

        // Affichage des informations du nouveau client
        System.out.println("ID client : " + this.id);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Sexe : " + this.sexe);
        System.out.println("Age : " + this.age);
        System.out.println("Vous êtes un nouveau client avec notre agence bancaire !");
    }

    // Méthode pour afficher le client
    public void afficherClient() {
        System.out.println("ID: " + id + " | Nom: " + nom + " | Prénom: " + prenom + " | Sexe: " + sexe + " | Age: " + age);
    }

    public int getId() {
        return id;
    }
}
