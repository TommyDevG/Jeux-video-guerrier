package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Guerrier ryuk = new Guerrier();
        Guerrier thor = new Guerrier("Thor", 200, 10, 5, "Devastator", 15);
        System.out.println(ryuk.getPointVie());
        /*
        Guerrier g2 = guerrierUtilisateur();
        System.out.println(g2.toString());
        */
        System.out.println(ryuk.getPointVie());
        System.out.println(thor.getPointVie());
        combat(ryuk, thor);
        System.out.println(ryuk.getPointVie());
        System.out.println(thor.getPointVie());
    }

    public static Guerrier guerrierUtilisateur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom de votre guerrier : ");
        String n = sc.nextLine();

        System.out.println("Saisir le nombre de point de vie de votre guerrier : ");
        int pv = sc.nextInt();

        System.out.println("Saisir la force de frappe de votre guerrier : ");
        int ff = sc.nextInt();

        System.out.println("Saisir la force de frappe de votre guerrier : ");
        int a = sc.nextInt();

        Guerrier guerrier = new Guerrier(n, pv, ff, a, "Devastator", 15);

        return guerrier;
    }

    public static boolean combat(Personnage g1, Guerrier g2) {
        while (g1.getPointVie() > 0 && g2.getPointVie() > 0) {
            g1.attaquer(g2);
            System.out.println(g2.getNom() + " a " + g2.getPointVie() + " pv");
            g2.attaquer(g1);
            System.out.println(g1.getNom() + " a " + g1.getPointVie() + " pv");
        }
        if (g1.getPointVie() > 0) {
            System.out.println("Le gagnant est " + g1.getNom());
        } else {
            System.out.println("Le gagnant est " + g2.getNom());
        }
        return true;
    }
}
