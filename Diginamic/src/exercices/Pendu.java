package exercices;

import java.util.Scanner;

public class Pendu {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez le mot à décourvrir: ");
            String word = scanner.nextLine();
            int tryErrors = 0;
            word = word.toLowerCase();
            StringBuilder hideWord = new StringBuilder(word.replaceAll("[a-zA-Z]", "_"));
            // String hideWord = word.replaceAll("[a-zA-Z]", "_");
            System.out.println(hideWord);

            while (word != hideWord.toString()) {
                if (word.equals(hideWord.toString())) {
                    System.out.println("Vous avez trouvé le mot :)");
                    break;
                }

                if (tryErrors == 5) {
                    System.out.println("Echec, vous avez fais trop d'erreurs");
                    break;
                }

                System.out.println("Entrez une lettre: ");
                String newLetter = scanner.nextLine();

                if (newLetter.length() == 1) {
                    String errorWord = hideWord.toString();
                    for (int i = 0; i < word.length(); i++) {
                        char letter = newLetter.charAt(0);

                        if (letter == word.charAt(i)) {
                            // String upper = String.valueOf(letter).toUpperCase();
                            hideWord.setCharAt(i, letter);
                            // hideWord = word.replaceAll("[a-zA-Z&&[^" + letter + upper + "]]", "_");
                        }
                    }
                    if (errorWord.equals(hideWord.toString())) {
                        tryErrors++;
                        System.out.println("\n" + "Erreur:" + tryErrors + "\n");
                    }
                    System.out.println("\n" + "--> " + hideWord + " <--" + "\n");
                } else {
                    System.out.println("Il ne faut entrer qu'une lettre");
                }
            }
        }
    }
}
