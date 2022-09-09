package com.company;

import java.util.Random;

public class Pretre extends Personnage{
    private int pointMana;
    private int puissanceSoin;

    public Pretre() {
        super();
        this.pointMana = 150;
        this.puissanceSoin = 20;
    }

    public Pretre(String n, int pv, int ff, int pm, int ps, String nomArme, int degatsArme) {
        super(n, pv, ff, nomArme, degatsArme);
        this.pointMana = pm;
        this.puissanceSoin = ps;
    }

    public int getPointMana() {
        return pointMana;
    }

    public void setPointMana(int pointMana) {
        this.pointMana = pointMana;
    }

    public int getPuissanceSoin() {
        return puissanceSoin;
    }

    public void setPuissanceSoin(int puissanceSoin) {
        this.puissanceSoin = puissanceSoin;
    }

    public boolean soigner(Personnage p) {

        if (this.pointMana >= 20) {
                if (p.getPointVie() < p.getPvMax()) {
                    int new_life = p.getPointVie() + this.puissanceSoin;
                    p.setPointVie(Math.min(new_life, p.getPvMax()));
                    this.pointMana -= 20;
                }
        }
        return true;
    }
}
