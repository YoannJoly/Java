package exercices;
import java.util.Scanner;

public class CorrectionTP1 {

    public static void main(final String[] args) {

        // Variables
        int viande, cuisson, poids;
        float coefficient = 0.0f;

        // Constantes
        final byte BOEUF = 1;
        final byte PORC = 2;

        final byte BLEU = 1;
        final byte A_POINT = 2;
        final byte BIEN_CUIT = 3;

        final byte UNE_MINUTE = 60;

        // Scanner
        final Scanner sc = new Scanner(System.in);

        // Viande
        System.out.println("Viande ?");
        System.out.println(BOEUF + " – Boeuf");
        System.out.println(PORC + " – Porc");
        viande = sc.nextInt();

        // Cuisson
        System.out.println("Cuisson ?");
        System.out.println(BLEU + " – Bleu");
        System.out.println(A_POINT + " – A point");
        System.out.println(BIEN_CUIT + " – Bien cuit");
        cuisson = sc.nextInt();

        // Poids
        System.out.println("Poids en gramme ?");
        poids = sc.nextInt();

        // Traitement
        switch (viande) {

            case BOEUF:
                if (cuisson == BLEU) {
                    coefficient = (float) (10.0 / 500.0);
                } else if (cuisson == A_POINT) {
                    coefficient = (float) (17.0 / 500.0);
                } else {
                    coefficient = (float) (25.0 / 500.0);
                }
                break;

            case PORC:
                if (cuisson == BLEU) {
                    coefficient = (float) (15.0 / 400.0);
                } else if (cuisson == A_POINT) {
                    coefficient = (float) (25.0 / 400.0);
                } else {
                    coefficient = (float) (40.0 / 400.0);
                }
                break;

            default:
                System.out.println("Données Invalides !");
                System.exit(1);
        }

        // Résultat
        System.out.println("Le temps de cuisson est de " + (poids * coefficient * UNE_MINUTE) + " secondes");

        // Fermeture du Scanner
        sc.close();
    }
}
