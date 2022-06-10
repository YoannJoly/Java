package tp_equals;

import tp10_list.Ville;

public class TestEquals {

    static Ville ville1 = new Ville("Montpellier", 400000);
    static Ville ville2 = new Ville("Montpellier", 400000);

    public static void main(final String[] args) {
        System.out.println("equals " + ville1.equals(ville2));
        System.out.println("equals nom " + ville1.nom.equals(ville2.nom));
        System.out.println("== " + (ville1 == ville2));
    }

}
