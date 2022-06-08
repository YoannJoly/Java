package tp11_set;

import java.util.Arrays;
import java.util.HashSet;

public class Pays {

    public static void main(String[] args) {
        System.out.println("Pays avec le PIB le plus important: " + greatestPib());
    }

    String nom;
    int nbreHabitants;
    int pib;

    public Pays(String nom, int nbreHabitants, int pib) {
        this.nom = nom;
        this.nbreHabitants = nbreHabitants;
        this.pib = pib;
    }

    static Pays usa = new Pays("USA", 329500000, 59495);
    static Pays france = new Pays("France", 67390000, 43551);
    static Pays allemagne = new Pays("Allemagne", 83240000, 50206);
    static Pays uk = new Pays("UK", 67220000, 40406);
    static Pays italie = new Pays("Italie", 59550000, 31770);
    static Pays japon = new Pays("Japon", 125800000, 42390);
    static Pays chine = new Pays("Chine", 1402000000, 12500);
    static Pays russie = new Pays("Russie", 144100000, 9554);
    static Pays inde = new Pays("Inde", 1380000, 1927);

    static HashSet<Pays> countries = new HashSet<Pays>(
            Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

    static String greatestPib() {
        int max = 0;
        String country = "";
        for (Pays i : countries) {
            if (i.pib > max) {
                max = i.pib;
                country = i.nom;
            }
        }
        return country;
    }

}
