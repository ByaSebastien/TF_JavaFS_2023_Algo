package be.btorm.exos;

import java.util.Scanner;

public class DateDiff {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secondeDate1 = 0;
        int secondeDate2 = 0;
        int secondDateResult = 0;

        System.out.print("Jour date1 : ");
        secondeDate1 += scanner.nextInt() * 86400;
        System.out.print("Heure date1 : ");
        secondeDate1 += scanner.nextInt() * 3600;
        System.out.print("Minute date1 : ");
        secondeDate1 += scanner.nextInt() * 60;
        System.out.print("Secondes date1 : ");
        secondeDate1 += scanner.nextInt();

        System.out.print("Jour date2 : ");
        secondeDate2 += scanner.nextInt() * 86400;
        System.out.print("Heure date2 : ");
        secondeDate2 += scanner.nextInt() * 3600;
        System.out.print("Minute date2 : ");
        secondeDate2 += scanner.nextInt() * 60;
        System.out.print("Secondes date2 : ");
        secondeDate2 += scanner.nextInt();

        secondDateResult = Math.abs(secondeDate1 - secondeDate2);

        int jour = secondDateResult / 86400;
        int heure = (secondDateResult % 86400) / 3600;
        int minute = (secondDateResult % 3600) / 60;
        int second = secondDateResult % 60;

        System.out.println("Il existe " + jour + " jour(s) " + heure + "heure(s) " + minute + " minute(s) " + second + " seconde(s) entre les 2 dates");
    }
}
