package tp13_tri;

import java.util.Comparator;

import tp10_list.Ville;

public class ComparatorNom implements Comparator<Ville> {

    @Override
    public int compare(final Ville o1, final Ville o2) {
        if (o1.nom.charAt(0) > o2.nom.charAt(0)) {
            return 1;
        }
        if (o1.nom.charAt(0) < o2.nom.charAt(0)) {
            return -1;
        }
        return 0;
    }

}
