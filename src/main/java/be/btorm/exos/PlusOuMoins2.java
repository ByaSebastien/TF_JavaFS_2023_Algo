package be.btorm.exos;

import java.util.Random;
import java.util.Scanner;

public class PlusOuMoins2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int nbToFind = random.nextInt(100) + 1;
        int nbUser;
        int tentative = 0;
        do{
            System.out.println("Nombre : ");
            nbUser = scanner.nextInt();
            tentative++;
            if(nbUser < nbToFind){
                System.out.println("C'est plus!");
            } else if (nbUser > nbToFind) {
                System.out.println("C'est moins!");
            } else{
                System.out.println("C'est gagné!");
                System.out.println("Vous avez réussi a trouver le nombre en " + tentative + " tentative(s)");
            }
        }while (nbToFind != nbUser);
    }
}
