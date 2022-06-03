package cours;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        // Déclaration de la liste
        ArrayList<Integer> list = new ArrayList<>();

        // Ajouter des éléments
        list.add(1);
        list.add(12);
        list.add(15);

        // Parcourir les éléments (For)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Supprimer un élement
        list.remove(1);

        // Parcourir les éléments (Foreach)
        for (int e : list) {
            System.out.println(e);
        }

        // Supprimer tous les éléments
        list.clear();

        // Savoir si la liste est vide
        System.out.println(list.isEmpty());
    }

}
