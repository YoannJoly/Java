package tp10_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    static List<Integer> list = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, -8, 5));

    public static void main(final String[] args) {
        System.out.println("Element de la liste: " + list);
        System.out.println("Taille de la liste: " + list.size());
        System.out.println("Plus grand élément de la liste: " + Collections.max(list));

        list.remove(Collections.min(list));
        System.out.println("Plus petit élément supprimmé: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, Math.abs(list.get(i)));
            }
        }

        System.out.println("Element négatif devenu positif: " + list);

    }
}
