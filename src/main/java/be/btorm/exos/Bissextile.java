package be.btorm.exos;

import java.util.Scanner;

public class Bissextile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int annee = scanner.nextInt();

        if((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)){
            System.out.println(annee + " est bissextile");
        }else{
            System.out.println(annee + " n'est pas bissextile");
        }
    }
}
