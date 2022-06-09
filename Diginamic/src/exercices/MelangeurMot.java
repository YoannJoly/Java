package exercices;
import java.util.Random;
import java.util.Scanner;

public class MelangeurMot {

    private static int generateRandomNumber(final int min, final int max) {
        return (new Random()).nextInt(max - min + 1) + min;
    }

    private static String shakeWord(final String word) {

        // Vérification de la taille du mot
        if (word == null || word.length() <= 3) {
            return word;
        }

        // Transformation du mot en tableau de caractéres
        final char[] letters = word.toCharArray();

        // Application 100 fois du mélange
        for (int i = 0; i < 100; i++) {

            // Génération des indices des lettre à intervertir
            final int index1 = generateRandomNumber(1, word.length() - 2);
            final int index2 = generateRandomNumber(1, word.length() - 2);

            // Echange des lettres aux indices
            final char tmp = letters[index1];
            letters[index1] = letters[index2];
            letters[index2] = tmp;
        }

        // Reconstitution du mot
        return new String(letters);
    }

    private static String shakeSentence(final String sentence) {

        // Vérification de la taille de la phrase
        if (sentence == null) {
            return null;
        }

        // Découpage de la phrase en mot
        final String[] words = sentence.split("\\W+");

        // Appel à la fonction de mélange de mot
        for (int i = 0; i < words.length; i++) {
            words[i] = shakeWord(words[i]);
        }

        return String.join(" ", words);
    }

    public static void main(final String[] args) {

        try (// Déclaration du scanner
        Scanner scanner = new Scanner(System.in)) {
            // Demande de la phrase
            System.out.println("Veuillez saisir la phrase: ");
            final String sentence = scanner.nextLine();

            // Affichage du résultat
            System.out.println(shakeSentence(sentence));
        }
    }
}
