package org.example;

public class Compte {
    private int id;
    private String nom;
    private double solde;

    public Compte(int id, String nom, double solde) {
        this.id = id;
        this.nom = nom;
        this.solde = solde;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + nom + " | Solde: " + solde;
    }
}
