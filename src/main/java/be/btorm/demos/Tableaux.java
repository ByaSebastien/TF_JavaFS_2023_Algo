package be.btorm.demos;

public class Tableaux {

    public static void main(String[] args) {

        String[] tab = new String[3];
        tab[0] = "Pierre";
        tab[1] = "Pol";
        tab[2] = "Jacques";

//        System.out.println(tab[1]);

        int i = 0;
        while(i < tab.length){
            System.out.print(tab[i] + " | ");
            i++;
        }
        System.out.println();

        int[] ints = new int[10];
        //| [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] |
        //i: 0     1     2     3     4     5     6     7     8     9

        i = 0;
        while (i < ints.length){
            ints[i] = i + 1;
            i++;
        }
        //| [1] | [2] | [3] | [4] | [5] | [6] | [7] | [8] | [9] | [10] |
        //i: 0     1     2     3     4     5     6     7     8      9

        StringBuilder sbValeur = new StringBuilder();
        StringBuilder sbIndice = new StringBuilder();
        i = 0;
        while (i < ints.length){
            sbValeur.append(ints[i] + " | ");
            sbIndice.append(i + " | ");
            i++;
        }
        System.out.println(sbValeur);
        System.out.println(sbIndice);
        System.out.println(i);
    }
}