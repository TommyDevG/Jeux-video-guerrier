package com.company;

import java.util.Random;

public class Mage extends Personnage{
    private int pointMana;
    private int puissanceSort;

    public Mage() {
        super();
        this.pointMana = 150;
        this.puissanceSort = 20;
    }

    public Mage(String n, int pv, int ff, int pm, int ps, String nomArme, int degatsArme) {
        super(n, pv, ff, nomArme, degatsArme);
        this.pointMana = pm;
        this.puissanceSort = ps;
    }

    public int getPointMana() {
        return pointMana;
    }

    public void setPointMana(int pointMana) {
        this.pointMana = pointMana;
    }

    public int getPuissanceSort() {
        return puissanceSort;
    }

    public void setPuissanceSort(int puissanceSort) {
        this.puissanceSort = puissanceSort;
    }

    public boolean lancerSort(Mage m) {
        if (this.pointMana >= 20) {
            m.setPointVie(m.getPointVie() - this.puissanceSort);
            this.pointMana -= 20;
        }
        return true;
    }
}
