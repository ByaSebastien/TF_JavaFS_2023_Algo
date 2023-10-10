package be.btorm.demos;

public class DemoConditions {

    public static void main(String[] args) {

        int jour = 5;

//        if (jour == 1) {
//            System.out.println("Lundi");
//        } else if (jour == 2) {
//            System.out.println("Mardi");
//        } else if (jour == 3) {
//            System.out.println("Mercredi");
//        } else if (jour == 4) {
//            System.out.println("Jeudi");
//        } else if (jour == 5) {
//            System.out.println("Vendredi");
//        } else if (jour == 6) {
//            System.out.println("Samedi");
//        } else if (jour == 7) {
//            System.out.println("Dimanche");
//        } else {
//            System.out.println("Erreur");
//        }

        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Erreur");
        }
        System.out.println("finito");
    }
}

