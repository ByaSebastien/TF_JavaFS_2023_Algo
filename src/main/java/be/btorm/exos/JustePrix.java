package be.btorm.exos;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input;
        int choix;
        int nbToFind = 0;
        boolean playAgain;

        do {
            do {
                do {
                    System.out.println("1 : facile\n2 : Moyen\n3 : difficile");
                    input = scanner.next();
                } while (!isInt(input));
                choix = Integer.parseInt(input);
            } while (!(choix > 0 && choix <= 3));

            switch (choix) {
                case 1:
                    nbToFind = random.nextInt(10) + 1;
                    break;
                case 2:
                    nbToFind = random.nextInt(100) + 1;
                    break;
                case 3:
                    nbToFind = random.nextInt(1000) + 1;
                    break;
            }

            int nbUser;
            int tentative = 0;
            boolean perdu = false;
            do {
                do {
                    System.out.println("Nombre : ");
                    input = scanner.next();
                } while (!isInt(input));
                nbUser = Integer.parseInt(input);
                tentative++;
                if (tentative == 10) {
                    perdu = true;
                }
                if (nbUser < nbToFind) {
                    System.out.println("C'est plus!");
                    System.out.println("Il vous reste " + (10 - tentative) + " tentative(s)");
                } else if (nbUser > nbToFind) {
                    System.out.println("C'est moins!");
                    System.out.println("Il vous reste " + (10 - tentative) + " tentative(s)");
                } else {
                    System.out.println("C'est gagné!");
                    System.out.println("Vous avez réussi a trouver le nombre en " + tentative + " tentative(s)");
                    perdu = false;
                }
            } while (nbToFind != nbUser && !perdu);

            if (perdu) {
                System.out.println("Perdus, le nombre magique etait : " + nbToFind);
            }

            System.out.println("Voulez vous rejouer?");
            playAgain = scanner.nextBoolean();
        } while (playAgain);
    }

    public static boolean isInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
