package cours;
public class Tableau {

    public static void main(String[] args) {

        // Chaine de caractères
        //String tabA[] = new String[]{"Chaine 1", "Chaine 2", "Chaine 3"};
        String tabB[] = new String[10];

        // Entier
        //int tabC[] = new int[]{1,2,3};
        int tabD[] = new int[10];

        // Modifie la valeur à l'index
        tabB[0] = "Chaine 1";
        tabB[1] = "Chaine 2";
        tabB[2] = "Chaine 3";
        tabB[3] = "Chaine 4";

        // Chaine de caractères
        for (int i = 0; i < tabB.length; i++) {
            System.out.println(tabB[i]);
        }

        // Entier
        for (int i = 0; i < tabD.length; i++) {
            System.out.println(tabD[i]);
        }

        // Foreach
        for (String s : tabB) {
            System.out.println(s);
        }
    }
}
