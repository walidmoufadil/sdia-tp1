package com.javaIntellij;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choix;
        do {
            System.out.println("-------------------------MENU----------------------------");
            System.out.println("\t\t 1- Saisir");
            System.out.println("\t\t 2- Afficher");
            System.out.println("\t\t 3- Inverser");
            System.out.println("\t\t 4- Nombre de mots");
            System.out.println("Frappez une touche pour revenir au menu (q pour quitter)");

            choix = sc.next();
            switch (choix) {
                case "1": String chaine = saisie();
                        break;
                case "2": afficheChaine(chaine);
                        break;
                case "3": System.out.println(inverserChaine(chaine));
                        break;
                case "4": System.out.println(nbMots(chaine));
                        break;

            }
        }while (choix.equals("q"));


//    String chaine = saisie();
//    afficheChaine(chaine);
//    System.out.println(inverserChaine(chaine));
//    System.out.println(nbMots(chaine));
    }

    public static String saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir une chaine :");
        return sc.nextLine();
    }

    public static void afficheChaine(String chaine){
        System.out.println(chaine);
    }

    public static String inverserChaine(String chaine){
        return new StringBuilder(chaine).reverse().toString();
    }
    public static int nbMots(String chaine){
       return chaine.split(" ").length;
    }
}
