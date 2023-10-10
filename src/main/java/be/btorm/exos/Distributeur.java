package be.btorm.exos;

import java.util.Scanner;

public class Distributeur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stockCoca = 0;
        int stockEau = 2;


        System.out.println("1 : Coca\n2 : Eau");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                if (stockCoca <= 0) {
                    System.out.println("Plus de coca");
                } else {
                    stockCoca--;
                    System.out.println("Voici du coca");
                }
                break;
            case 2:
                if (stockEau <= 0) {
                    System.out.println("Plus d'eau");
                } else {
                    stockEau--;
                    System.out.println("Voici votre eau");
                }
                break;
            default:
                System.out.println("Choix invalide");
        }
    }
}
