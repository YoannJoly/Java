package exercices;
import java.util.Scanner;

public class Palindrome {

    private static boolean isPalindrome(String word) {

        // Vérification de la taille du mot
        if (word == null || word.length() < 2) {
            return false;
        }

        // Transformation en minuscule
        word = word.toLowerCase();

        // Traitement
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (// Déclaration du scanner
        Scanner scanner = new Scanner(System.in)) {
            // Demande du mot
            System.out.println("Veuillez saisir un mot: ");
            String word = scanner.nextLine();

            // Résultat
            System.out.println("Le mot " + word + " "+ (isPalindrome(word) ? "est" : "n'est pas") + " un palindrome !");
        }
    }
}
