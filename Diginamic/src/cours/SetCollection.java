package cours;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollection {

    public static void main(String[] args) {

        // Déclaration de la liste
        HashSet<Integer> set = new HashSet<>();

        // Ajouter des éléments
        set.add(1);
        set.add(12);
        set.add(15);
        set.add(1);

        // Parcourir les éléments (Iterator)
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Supprimer un élement
        set.remove(1);

        // Parcourir les éléments (Foreach)
        for (int e : set) {
            System.out.println(e);
        }

        // Supprimer tous les éléments
        set.clear();

        // Savoir si la liste est vide
        System.out.println(set.isEmpty());
    }

}
