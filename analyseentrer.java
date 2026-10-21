package TPJAVA1;

import java.util.Scanner;

public class analyseentrer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme=0;
        int nombredevaleur=0;
        double moyenner=0.0;
        int paires=0;
        int impaires=0;
        int positives=0;
        int negatives=0;
        System.err.println("entrez une suite d'entier: ");
        while(true){
            int valeur= scanner.nextInt();
            if (valeur == 0){
                break;
            }
            somme= somme+valeur;
            nombredevaleur++;
            if(valeur%2==0){
                paires++;
            }else{
                impaires++;
            }
            if(valeur > 0){
                positives++;
            }else{
                negatives++;
            }
        }
        moyenner=somme/nombredevaleur;
        System.out.println("vous avez entrez "+nombredevaleur+" valeurs");
        System.out.println("la somme des valeurs est: "+somme);
        System.out.println(paires+" parmi eu est paires ");
        System.out.println("le nombre d'impaires est: "+impaires);
        System.out.println("le nombre de valeurs positives est: "+positives);
        System.out.println("le nombre de valeurs negatives est: "+negatives);
        System.out.println("la moyenne des valeurs est: "+moyenner);
    }
    
}
