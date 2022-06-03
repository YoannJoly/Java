package cours;
import java.util.Random;

public class Fonctions {

    public static void main(String[] args) {

        // Utilisation de la fonction
        int c = additionF(5,2);
        int d = additionF(60,250);

        // Utilisation d'une procédure
        additionP(c,d);

        // Utilisation chainée
        additionP(additionF(additionF(10,4),2), additionF(60,250));

        // Nombre Aléatoire
        System.out.println(nombreAleatoire(0,100));
        System.out.println(nombreAleatoire(100));

        // Division
        System.out.println(division(5,2));
        System.out.println(division(5f,2f));
    }

    // Fonction
    public static int additionF(int a, int b) {
        return a + b;
    }

    // Procédure
    public static void additionP(int a, int b) {
        System.out.println(additionF(a,b));
    }

    // Procédure (Utilisation du return)
    public static void divisionP(int a, int b) {

        if (b == 0) {
            return;
        }

        System.out.println(a/b);
    }

    // Argument par défaut - Surcharge
    public static int nombreAleatoire(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static int nombreAleatoire(int max) {
        return nombreAleatoire(0, max);
    }

    // Divison surcharge
    public static int division(int a, int b) {
        return (int) division((float)a, (float)b);
    }

    public static float division(float a, float b) {
        return a/b;
    }
}
