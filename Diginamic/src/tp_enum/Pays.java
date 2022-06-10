package tp_enum;

import java.util.Arrays;
import java.util.HashSet;

public class Pays {

    public static void main(final String[] args) {
        System.out.println("Pays avec le PIB le plus important: " + greatestPib());
    }

    String nom;
    int nbreHabitants;
    int pib;
    private final Continent continent;

    public Pays(final String nom, final int nbreHabitants, final int pib, final Continent continent) {
        this.nom = nom;
        this.nbreHabitants = nbreHabitants;
        this.pib = pib;
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    static Pays usa = new Pays("USA", 329500000, 59495, Continent.AMERIQUE);
    static Pays france = new Pays("France", 67390000, 43551, Continent.EUROPE);
    static Pays allemagne = new Pays("Allemagne", 83240000, 50206, Continent.EUROPE);
    static Pays uk = new Pays("UK", 67220000, 40406, Continent.EUROPE);
    static Pays italie = new Pays("Italie", 59550000, 31770, Continent.EUROPE);
    static Pays japon = new Pays("Japon", 125800000, 42390, Continent.ASIE);
    static Pays chine = new Pays("Chine", 1402000000, 12500, Continent.ASIE);
    static Pays russie = new Pays("Russie", 144100000, 9554, Continent.EUROPE);
    static Pays inde = new Pays("Inde", 1380000, 1927, Continent.ASIE);

    static HashSet<Pays> countries = new HashSet<Pays>(
            Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

    static String greatestPib() {
        int max = 0;
        String country = "";
        for (final Pays i : countries) {
            if (i.pib > max) {
                max = i.pib;
                country = i.nom;
            }
        }
        return country;
    }

    @Override
    public String toString() {
        return nom + " " + nbreHabitants + " " + pib + " " + continent.getNomContinent();
    }

}
