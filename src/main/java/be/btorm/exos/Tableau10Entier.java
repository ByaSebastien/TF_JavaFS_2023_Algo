package be.btorm.exos;

public class Tableau10Entier {

    public static void main(String[] args) {

        int[] tab = new int[10];
        int valeur = 2;
        int i = 0;
        while (i < tab.length){
            tab[i] = valeur;
            valeur *= 2;
            i++;
        }
        i = 0;
        while (i < tab.length){
            System.out.print(tab[i++] + " | ");
        }
    }
}
