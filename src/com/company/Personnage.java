package com.company;

import java.util.Random;

public class Personnage {
    protected String nom;
    protected int pointVie;
    protected int forceFrappe;
    protected int pvMax;
    protected Arme arme;

    public Personnage() {
        this.nom = "Joe";
        this.pointVie = 100;
        this.forceFrappe = 10;
        this.pvMax = pointVie;
        this.arme = new Arme();
    }

    public Personnage(String n, int pv, int ff, String nomArme, int degatsArme) {
        this.nom = n;
        this.pointVie = pv;
        this.forceFrappe = ff;
        this.pvMax = pointVie;
        this.arme = new Arme(nomArme, degatsArme);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public int getPointVie() {
        return pointVie;
    }

    public void setPointVie(int pv) {
        this.pointVie = pv;
    }

    public int getForceFrappe() {
        return forceFrappe;
    }

    public void setForceFrappe(int ff) {
        this.forceFrappe = ff;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvm) {
        this.pvMax = pvm;
    }

    public Arme getArme() {
        return this.arme;
    }

    public void setArme(Arme a) {
        arme = a;
    }

    @Override
    public String toString() {
        return "Guerrier {" + "nom='" + nom + '\'' + ", point de vie =" + pointVie + ", force de frappe =" + forceFrappe + '}';
    }

    public void crier() {
        System.out.println("Je suis " + this.nom + "tremblé mortel !");
    }

    public boolean attaquer(Personnage g) {
        boolean res = false;

        Random r = new Random();
        int c = r.nextInt(100);

        if (g instanceof Guerrier) {
            if (c <= 2) {
                System.out.println(this.nom + " a manqué son attaque");
            } else if (c == 3) {
                System.out.println(this.nom + " a mis un coup critique a " + g.getNom() + " c'est très efficace !");
                g.setPointVie(g.getPointVie() - ((this.forceFrappe * 2) - ((Guerrier) g).getArmure()));
                res = true;
            } else {
                System.out.println(this.nom + " frappe " + g.getNom());
                g.setPointVie(g.getPointVie() - (this.forceFrappe - ((Guerrier) g).getArmure()));
                res = true;
            }
        } else {
            if (c <= 2) {
                System.out.println(this.nom + " a manqué son attaque");
            } else if (c == 3) {
                System.out.println(this.nom + " a mis un coup critique a " + g.getNom() + " c'est très efficace !");
                g.setPointVie(g.getPointVie() - this.forceFrappe * 2);
                res = true;
            } else {
                System.out.println(this.nom + " frappe " + g.getNom());
                g.setPointVie(g.getPointVie() - this.forceFrappe);
                res = true;
            }
        }
        return res;
    }
}
