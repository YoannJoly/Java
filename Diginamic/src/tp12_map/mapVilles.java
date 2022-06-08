package tp12_map;

import java.util.HashMap;

import tp10_list.Ville;

public class mapVilles {

    public static void main(String[] args) {
        HashMap<String, Integer> cities = new HashMap<String, Integer>();

        for (Ville i : Ville.getCities()) {
            cities.put(i.nom, i.nbrHabitants);
        }

        System.out.println(cities);
    }
}
