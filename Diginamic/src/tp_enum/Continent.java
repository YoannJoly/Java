package tp_enum;

public enum Continent {

    EUROPE("Europe"),
    AMERIQUE("Amerique"),
    ASIE("Asie"),
    OCEANIE("Oceanie"),
    AFRIQUE("Afrique");

    private String nomContinent;

    public String getNomContinent() {
        return nomContinent;
    }

    private Continent(final String nomContinent) {
        this.nomContinent = nomContinent;
    }

}
