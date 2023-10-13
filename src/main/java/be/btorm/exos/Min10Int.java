package be.btorm.exos;

import java.util.Scanner;

public class Min10Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cpt = 0;
        int nbUser;
        int min = Integer.MAX_VALUE;

        while (cpt < 10){
            System.out.print("Nombre " + (cpt + 1) + " : ");
            nbUser = scanner.nextInt();
            if(nbUser < min){
                min = nbUser;
            }
            cpt++;
        }

        System.out.println("Le min est " + min);
    }
}
