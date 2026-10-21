package TPJAVA1;
import java.util.Scanner;
import java.lang.Math;
public class effectuercalcule {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Puissance");
        System.out.println("2. Racine carree");
        System.out.println("3. valeur absolue");
        System.out.println("4. Quitter");  
        System.out.println("choisissez une option: ");
        int operation= scanner.nextInt();
        while(operation!=4){
            if(operation==1){
                System.out.println("donner votre nombres: ");
                int val1= scanner.nextInt();
                System.out.println("donner la puissance: ");
                int val2= scanner.nextInt();
                System.out.println(val1+" a la puissance "+val2+" = "+Math.pow(val1,val2));
            }else if(operation==2){
                System.out.println("donner votre nombres: ");
                int val1= scanner.nextInt();
                System.out.println("la racine caree de "+val1+" = "+Math.sqrt(val1));
            }else if(operation==3){
               System.out.println("donner votre nombres: ");
               int val1= scanner.nextInt(); 
               System.out.println("la valeur absolue de: "+val1+" = "+(val1>0? val1:-val1));
            }else{
                System.out.println("operation non determiner.");
            }
            System.out.println("choisissez une autre option: ");
            operation = scanner.nextInt();
        } 

        }
}
