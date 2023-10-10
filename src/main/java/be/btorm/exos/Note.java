package be.btorm.exos;

import java.util.Scanner;

public class Note {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Notes : ");
        int note = scanner.nextInt();

        if(note < 0 || note > 20){
            System.out.println("Error");
        }else{
            if (note <= 10){
                System.out.println("I");
            } else if (note <= 12) {
                System.out.println("S");
            } else if (note <= 15) {
                System.out.println("B");
            } else if (note <= 18) {
                System.out.println("TB");
            } else {
                System.out.println("Excellent!");
            }
        }
    }
}
