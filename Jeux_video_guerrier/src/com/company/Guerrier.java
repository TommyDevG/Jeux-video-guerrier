package com.company;

import java.util.Random;

public class Guerrier extends Personnage {
    private int armure;

    public Guerrier() {
        super();
        this.armure = 5;
    }

    public Guerrier(String n, int pv, int ff, int a, String nomArme, int degatsArme) {
        super(n, pv, ff, nomArme, degatsArme);
        this.armure = a;
    }

    public int getArmure() {
        return armure;
    }

    public void setArmure(int a) {
        this.armure = a;
    }

    @Override
    public boolean attaquer(Personnage g) {
        //attaquer + 20%
        boolean res = false;

        Random r = new Random();
        int rater = r.nextInt(100);
        int critique = r.nextInt(100);

        if (g instanceof Guerrier) {
            if (rater <= 2) {
                System.out.println(this.nom + " a manqué son attaque");
            } else if (critique == 1) {
                System.out.println(this.nom + " a mis un coup critique a " + g.getNom() + " c'est très efficace !");
                g.setPointVie(g.getPointVie() - (((this.forceFrappe + (this.forceFrappe * 20 / 100)) * 2) - ((Guerrier) g).getArmure()));
                res = true;
            } else {
                System.out.println(this.nom + " frappe " + g.getNom());
                g.setPointVie(g.getPointVie() - ((this.forceFrappe + (this.forceFrappe * 20 / 100)) - ((Guerrier) g).getArmure()));
                res = true;
            }
        } else {
            if (rater <= 2) {
                System.out.println(this.nom + " a manqué son attaque");
            } else if (critique == 1) {
                System.out.println(this.nom + " a mis un coup critique a " + g.getNom() + " c'est très efficace !");
                g.setPointVie(g.getPointVie() - (this.forceFrappe + (this.forceFrappe * 20 / 100)) * 2);
                res = true;
            } else {
                System.out.println(this.nom + " frappe " + g.getNom());
                g.setPointVie(g.getPointVie() - (this.forceFrappe + (this.forceFrappe * 20 / 100)));
                res = true;
            }
        }
        return res;
    }
}
