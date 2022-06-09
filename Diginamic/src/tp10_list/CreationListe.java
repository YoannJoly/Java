package tp10_list;

import java.util.ArrayList;

public class CreationListe {

    public static void main(final String[] args) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        // System.out.println(list);
        System.out.println(list.size());
    }

}
