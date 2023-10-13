package be.btorm.exos;

import java.util.Scanner;

public class RemplirTab {

    private static final int TAILLE = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[TAILLE];
        int nbElem = 0;

        int i = 0;
        while (i < TAILLE) {
            System.out.print("Nombre " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
            nbElem++;
            i++;
        }

        i = 0;
        while (i < nbElem) {
            System.out.print(tab[i] + " | ");
            i++;
        }
    }
}
