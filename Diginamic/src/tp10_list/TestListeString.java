package tp10_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
    static List<String> list = new ArrayList<String>(
            Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

    public static void main(final String[] args) {
        int index = 0;
        int elementLength = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > elementLength) {
                index = i;
                elementLength = list.get(i).length();
            }
        }

        System.out.println("Ville avec le plus grand nombre de lettres: " + list.get(index));
    }
}
