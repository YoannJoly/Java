package tp12_map;

import java.util.HashMap;

public class CreationMap {

    public static void main(final String[] args) {
        final HashMap<String, Integer> mapSalaires = new HashMap<String, Integer>();

        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        System.out.println("Taille de la map: " + mapSalaires.size());

    }
}
