package com.javaIntellij;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombres des élements a saisir: ");
        int n = sc.nextInt();
        float[] notes = new float[n];
        saisieNotes(notes);
        trier(notes);
        printItems(notes);
        System.out.println("la moyenne est : "+moyenne(notes));
        System.out.println("MAX :  "+ notes[noteMax(notes)]);
        System.out.println("MIN :  "+ notes[noteMin(notes)]);
        System.out.println("Veuillez saisir la notes");
        float note = sc.nextFloat();
        System.out.println("la note "+note+" est répetée "+nbElements(notes,note)+" fois");
    }

    public static void saisieNotes(float[] notes) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Veuillez saisir le nombre " + (i + 1) + ": ");
            try {
                notes[i] = sc.nextFloat();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void trier(float[] tab){
        Arrays.sort(tab);
    }

    public static void printItems(float[] tab){
        for(float f : tab){
            System.out.println(f);
        }
    }

    public static float moyenne(float[] tab){
        float sum = 0;
        for(float f : tab){
            sum += f;
        }
        return sum / tab.length;
    }

    public static int noteMax(float[] tab){
        int maxIndex = 0;
        for(int i = 1; i<tab.length; i++){
            if(tab[i] > tab[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int noteMin(float[] tab){
        int minIndex = 0;
        for(int i = 1; i<tab.length; i++){
            if(tab[i] < tab[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int nbElements(float[] tab, float note){
        int nb = 0;
        for (float f: tab){
            if(f == note){
                nb += 1;
            }
        }
        return nb;
    }
}
