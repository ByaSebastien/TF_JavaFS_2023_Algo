package be.btorm.exos;

import java.util.Scanner;

public class Nimp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nbRep,nbTiret,nbEspace;
        int actualRep = 0,actualTiret = 0,actualEspace = 0;

        System.out.print("nbRep : ");
        nbRep = scanner.nextInt();
        System.out.print("nbTiret : ");
        nbTiret = scanner.nextInt();
        System.out.print("nbEspace : ");
        nbEspace = scanner.nextInt();



        StringBuilder sb = new StringBuilder();
        sb.append("|");
        while(actualRep < nbRep){
            actualTiret = 0;
            while(actualTiret < nbTiret){
                sb.append("-");
                actualTiret++;
            }
            actualEspace = 0;
            while (actualEspace < nbEspace){
                sb.append(" ");
                actualEspace++;
            }
            actualRep++;
        }
        sb.append("|");

        System.out.println(sb.toString());
    }
}