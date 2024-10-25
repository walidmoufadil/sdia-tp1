package com.javaIntellij;

import java.util.Scanner;

public class Exercice3 {
    static String chaine;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choix;
        boolean sortie = false;
        while(!sortie) {
            afficherMenu();
            System.out.println("Veuillez Entrer votre choix");
            choix = sc.next();

            switch (choix) {
                case "1":
                    chaine = saisie();
                    saisieCaractere();
                        break;
                case "2":
                    if(chaine.isEmpty())
                        System.out.println("Veuillez saisir une chaine d'abord");
                    else
                        afficheChaine(chaine);
                    saisieCaractere();
                    break;
                case "3":
                    if(chaine.isEmpty())
                        System.out.println("Veuillez saisir une chaine d'abord");
                    else
                        System.out.println(inverserChaine(chaine));
                    saisieCaractere();
                    break;
                case "4":
                    if(chaine.isEmpty())
                        System.out.println("Veuillez saisir une chaine d'abord");
                    else
                        System.out.println(nbMots(chaine));
                    saisieCaractere();
                    break;
                case "q":
                        sortie = true;
                        break;
                default:
                        System.out.println("Veuillez Entrer un choix valide");
                        saisieCaractere();
                    break;
            }
        }
        sc.close();

    }
    public static void afficherMenu(){
        System.out.println("-------------------------MENU----------------------------");
        System.out.println("\t\t 1- Saisir");
        System.out.println("\t\t 2- Afficher");
        System.out.println("\t\t 3- Inverser");
        System.out.println("\t\t 4- Nombre de mots");
        System.out.println("\t\t q- quitter");
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
    public static void saisieCaractere(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Frappez une touche pour revenir au menu");
        sc.next();
    }
}