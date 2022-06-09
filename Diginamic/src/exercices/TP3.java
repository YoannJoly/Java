package exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TP3 {

    public static void main(final String[] args) {
        palindrome("laval");
        randomizer();
    }

    public static void palindrome(final String a) {
        final String[] words = a.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reverseWord.trim();
        }

        System.out.println("Mot de base: " + a);
        System.out.println("Mot inversé: " + reversedString);

        if (reversedString.equals(a)) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
    }

    public static void randomizer() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Saisissez une phrase: ");
            final String random = in.nextLine();
            final String[] words = random.split("\\W+");
            final StringBuilder builder = new StringBuilder();
            for (final String word : words) {
                final List<Character> letters = new ArrayList<Character>();
                for (final char letter : word.toCharArray()) {
                    letters.add(letter);
                }
                if (letters.size() > 2) {
                    Collections.shuffle(letters.subList(1, letters.size() - 1));
                }
                for (final char letter : letters) {
                    builder.append(letter);
                }
                builder.append(" ");
            }
            System.out.println(builder.toString());
        }
    }
}