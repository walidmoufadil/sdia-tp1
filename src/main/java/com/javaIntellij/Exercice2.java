package com.javaIntellij;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        String verbe = saisieVerbe();
        if(verifierverbe(verbe)){
            conjuguer(verbe);
        }
    }

    public static String saisieVerbe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir un verbe du premier groupe: ");
        return sc.nextLine();
    }

    public static boolean verifierverbe(String verbe){
        int length = verbe.length();
        if(verbe.substring(length - 2).equals("er")){
            return true;
        }
        return false;
    }

    public static void conjuguer(String verbe){

        String chaine = verbe.substring(0,verbe.length()-2);
        System.out.println("Je "+chaine+"e");
        System.out.println("Tu "+chaine+"es");
        System.out.println("Il/Elle/On "+chaine+"e");
        System.out.println("Nous "+chaine+"ons");
        System.out.println("Vous "+chaine+"ez");
        System.out.println("ils/Elles "+chaine+"ent");
    }
}
