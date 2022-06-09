package exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Distributeur {

    public static void main(final String[] args) {

        // Variables
        final float PRIX_CAFE = 0.60f;
        int credit = 0;
        int redit;
        int nbPieces;

        try (// Déclaration du Scanner
                Scanner sc = new Scanner(System.in)) {
            // Message d'informations
            System.out.println("Faites l'appoint (pièces acceptées : 0.05, 0.10, 0.20, 0.50, 1, 2) € : ");

            do {

                // Demande de la saisie
                final float saisie = sc.nextFloat();

                // Vérification de la saisie
                if (saisie != 0.05f && saisie != 0.10f && saisie != 0.20f && saisie != 0.50f && saisie != 1f
                        && saisie != 2f) {
                    System.err.println("Pièce non acceptée !");
                    continue;
                }

                // Calcul du crédit
                credit = (int) (credit + (saisie * 100));
                if (credit < (PRIX_CAFE * 100)) {
                    System.err.println("Crédit insuffisant (" + credit / 100.0 + " € / " + PRIX_CAFE + " €)");
                }

            } while (credit < (PRIX_CAFE * 100));
        }

        // Monnaie
        redit = credit - ((int) (PRIX_CAFE * 100));
        System.out.println("Votre monnaie (" + redit / 100f + " €)");

        // Pieces Accéptées
        final ArrayList<Integer> pieces = new ArrayList<>(Arrays.asList(100, 50, 20, 10, 5));

        // Parcours des piéces
        for (final int piece : pieces) {

            // Vérification des pieces
            if (redit >= piece) {
                nbPieces = redit / piece;
                redit = redit - (nbPieces * piece);

                System.out.println("  -> " + nbPieces + " pièce(s) de " + (piece / 100f) + " €");
            }
        }
    }
}
