package exercices;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Binaire {

    private static int bin2dec(String bin) throws InvalidPropertiesFormatException {

        // Variables
        int sum = 0;

        // Parcours de la chaine
        for (int i = 0; i < bin.length(); i++) {

            // Vérification de la chaine
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                throw new InvalidPropertiesFormatException("");
            }

            // Récupération du multiplicateur
            int mutliplicator = Integer.parseInt("" + bin.charAt(bin.length() - 1 - i));

            // Calcul avec la puissance
            sum+= mutliplicator * Math.pow(2, i);
        }

        return sum;
    }

    public static void main(String[] args) {

        try (// Déclaration du Scanner
        Scanner sc = new Scanner(System.in)) {
            // Message d'informations
            System.out.println("Veuillez saisir un nombre binaire:");
            String bin = sc.nextLine();

            // Resultat
            try {
                System.out.println(bin2dec(bin));
            } catch (InvalidPropertiesFormatException e) {
                System.err.println("Le nombre binaire est invalide !");
            }
        }
    }
}

