package tp12_map;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(final String args[]) {

        final HashMap<Integer, String> mapVilles = new HashMap<>();

        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(69, "Lyon");
        mapVilles.put(59, "Lille");
        mapVilles.put(33, "Bordeaux");

        System.out.println("Ensembles de clés:");
        for (final int i : mapVilles.keySet()) {
            System.out.println(i);
        }

        System.out.println("Ensemble de villes:");
        for (final String i : mapVilles.values()) {
            System.out.println(i);
        }

        System.out.println("Taille de la map: " + mapVilles.size());
    }
}
