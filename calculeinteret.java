package TPJAVA1;
public class calculeinteret{
    public static void main(String[] args) {
       double capital=10000;
       int annee=0;
       while (capital<15000){
           capital=capital+ capital*0.045;
           annee++;
       }
       System.out.println("le capitale besoin de "+annee+" pour qu'il depasse 15000dh");
       System.out.println("ca veux dire que au bout de "+(2026+annee)+" le capitale devient: "+capital+"dh");
    }
}