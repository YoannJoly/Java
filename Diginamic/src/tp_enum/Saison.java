package tp_enum;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    String saison;
    int saisonNumber;

    private Saison(final String saison, final int saisonNumber) {
        this.saison = saison;
        this.saisonNumber = saisonNumber;
    }

    public String getSaison() {
        return saison;
    }

    static Saison getByName(final String name) {
        for (final Saison i : Saison.values()) {
            if (i.saison.equals(name))
                return i;
        }
        return null;
    }

}
