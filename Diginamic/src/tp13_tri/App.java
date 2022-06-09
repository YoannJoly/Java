package tp13_tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import tp10_list.Ville;

public class App {

    static List<Ville> compareCity = new ArrayList<Ville>(Ville.getCities());

    public static void main(final String[] args) {
        compareCity.sort(Comparator.naturalOrder());

        System.out.println("Comparator natural order: " + compareCity);

        Collections.sort(compareCity);

        System.out.println("Collections sort: " + compareCity);

        Collections.sort(compareCity, new ComparatorHabitant());

        System.out.println("Comparatorhabitant: " + compareCity);

        Collections.sort(compareCity, new ComparatorNom());

        System.out.println("ComparatorNom: " + compareCity);
    }
}
