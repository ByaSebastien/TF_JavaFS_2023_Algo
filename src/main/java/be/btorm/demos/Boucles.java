package be.btorm.demos;

public class Boucles {

    public static void main(String[] args) {

        String[] noms = new String[3];
        noms[0] = "Pierre";
        noms[1] = "Pol";
        noms[2] = "Jacques";

//        int i;
//        while (i < noms.length){
//            System.out.println(noms[i]);
//            i++;
//        }
        for(int i = 0;i < noms.length; i++){
            System.out.println(noms[i]);
        }
        System.out.println("_____________________________________________");
        for(int i = 0;i < noms.length; i++){
            System.out.println(i);
        }
        System.out.println("_____________________________________________");
        for(String nom : noms){
            System.out.println(nom);
        }
    }
}
