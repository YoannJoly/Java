package tp10_list;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(final String args[]) {

        final List<String> liste1 = new ArrayList<String>();

        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        final List<String> liste2 = new ArrayList<String>();

        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        final List<String> liste3 = new ArrayList<String>();

        for (int i = 0; i < liste1.size(); i++) {
            liste3.add(liste1.get(i));
        }

        for (int i = 0; i < liste2.size(); i++) {
            liste3.add(liste2.get(i));
        }

        System.out.println(liste3);

    }
}
