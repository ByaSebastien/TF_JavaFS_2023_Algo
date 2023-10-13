package be.btorm.exos;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;
        int nbTentative = 0;
        boolean isBlocked = false;

        do{
            System.out.print("Password : ");
            password = scanner.next();
            nbTentative++;
            if(nbTentative == 3){
                isBlocked = true;
            }
        }while (!password.equals("Toto") && !isBlocked);

        if(isBlocked){
            System.out.println("Blocked");
        }else{
            System.out.println("Welcome");
        }
    }
}
