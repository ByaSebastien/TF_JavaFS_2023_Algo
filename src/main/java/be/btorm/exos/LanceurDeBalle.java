package be.btorm.exos;

import java.util.Scanner;

public class LanceurDeBalle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nbBalles = 10;
        boolean panierVide = nbBalles == 0;
        boolean pret;

        System.out.println("T'es prêt gamin?");
        pret = scanner.nextBoolean();

        if(pret){
            if (panierVide){
                System.out.println("Plus de balles");
            }else{
                nbBalles--;
//                nbBalles = nbBalles - 1;
//                nbBalles -= 1;
                System.out.println("Attrape!");
            }
        }else {
            System.out.println("???");
        }
    }
}
