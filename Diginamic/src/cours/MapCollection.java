package cours;

import java.util.HashMap;

public class MapCollection {

    public static void main(String[] args) {

        // Déclaration de la map
        HashMap<String, String> map = new HashMap<>();

        // Ajouter des éléments
        map.put("key_1", "Valeur de la clé 1");
        map.put("key_2", "Valeur de la clé 2");
        map.put("key_3", "Valeur de la clé 3");

        // Parcourir les éléments (Foreach - Valeur)
        for (String s : map.values()) {
            System.out.println(s);
        }

        // Supprimer un élement
        map.remove("key_1");

        // map.put("key_1", null);

        // Parcourir les éléments (Foreach - Clé)
        for (String s : map.keySet()) {
            System.out.println(s);
            System.out.println(map.get(s));
        }

        // Supprimer tous les éléments
        map.clear();

        // Savoir si la liste est vide
        System.out.println(map.isEmpty());
    }

}
