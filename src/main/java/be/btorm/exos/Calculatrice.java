package be.btorm.exos;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        double result = 0;
        System.out.println("Nombre 1 : ");
        double nb1 = scanner.nextDouble();
        System.out.println("Operator : ");
        char op = scanner.next().charAt(0);
        System.out.println("Nombre 2 : ");
        double nb2 = scanner.nextDouble();

        switch (op) {

            case '+':
                result = nb1 + nb2;
                break;
            case '-':
                result = nb1 - nb2;
                break;
            case '*':
                result = nb1 * nb2;
                break;
            case '/':
                if (nb2 == 0) {
                    System.out.println("Division par 0 impossible");
                    isValid = false;
                } else {
                    result = nb1 / nb2;
                }
                break;
            default:
                System.out.println("Erreur");
                isValid = false;
        }

        if (isValid) {
            System.out.println(nb1 + " " + op + " " + nb2 + " = " + result);
        }
    }
}
