package tp10_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ville {
    public static void main(String[] args) {
        System.out.println("Ville avec le plus d'habitants: " + greatestCity());
        System.out.println("Toutes les villes: " + cities);

        cities.remove(smallestCity());

        System.out.println("Liste sans la plus petite ville: " + cities);
    }

    String nom;
    int nbrHabitants;

    public Ville(String nom, int nbrHabitants) {
        this.nom = nom;
        this.nbrHabitants = nbrHabitants;
    }

    static Ville nice = new Ville("Nice", 343000);
    static Ville carcassonne = new Ville("Carcassonne", 47800);
    static Ville narbonne = new Ville("Narbonne", 53400);
    static Ville lyon = new Ville("Lyon", 484000);
    static Ville foix = new Ville("Foix", 9700);
    static Ville pau = new Ville("Pau", 77200);
    static Ville marseille = new Ville("Marseille", 850700);
    static Ville tarbes = new Ville("Tarbes", 40600);

    static List<Ville> cities = new ArrayList<Ville>(
            Arrays.asList(nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes));

    static String greatestCity() {
        int index = 0;
        int greatestNumber = cities.get(0).nbrHabitants;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).nbrHabitants > greatestNumber) {
                index = i;
                greatestNumber = cities.get(i).nbrHabitants;
            }
        }
        return cities.get(index).nom;
    }

    static int smallestCity() {
        int index = 0;
        int smallestNumber = cities.get(0).nbrHabitants;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).nbrHabitants < smallestNumber) {
                index = i;
                smallestNumber = cities.get(i).nbrHabitants;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return nom + " " + nbrHabitants;
    }

}
