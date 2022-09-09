package com.company;

public class Arme {
    private String nom;
    private int degats;

    public Arme() {
        this.nom = "Epée";
        this.degats = 30;
    }

    public Arme(String n, int d) {
        this.nom = n;
        this.degats = d;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public int getDegats() {
        return this.degats;
    }

    public void setDegats(int d) {
        this.degats = d;
    }

    @Override
    public String toString() {
        return "l'arme s'appelle " + this.nom + " ses dégats sont de " + this.degats;
    }
}
