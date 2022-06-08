package tp11_set;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        System.out.println("Pays qui a le plus grand nombre de lettres: " + longestCountry());
        deleteCountry();
        System.out.println("Pays precedent supprimmé: " + hashset);
    }

    static HashSet<String> hashset = new HashSet<String>(
            Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

    static String longestCountry() {
        String longestCountry = "";
        for (String i : hashset) {
            if (i.length() > longestCountry.length()) {
                longestCountry = i;
            }
        }
        return longestCountry;
    }

    static void deleteCountry() {
        hashset.remove(longestCountry());
    }

}
