package com.javaIntellij;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
    String chaine = saisie();
    nbOccurence(chaine);
    }

    public static String saisie(){
        System.out.println("Veuillez saisir une chaine");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void nbOccurence(String chaine){
        int[] nbOccurence = new int[26];
        char[] charArray = chaine.toCharArray();
        for (int i = 'a'; i <= 'z'; i++) {
            for (char c : charArray) {
                if (c == i) {
                    nbOccurence[i - 'a'] += 1;
                }
            }
            if(nbOccurence[i - 'a'] != 0)
                System.out.println("l'alphabet "+ (char) i +" est repeté "+ nbOccurence[i - 'a'] +" fois");
        }
    }
}
