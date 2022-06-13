package tp_reservation;

public class Adresse {

    private final String rue;
    private final String codePostal;
    private final String ville;
    private final int numero;

    public Adresse(final String rue, final String codePostal, final String ville, final int numero) {
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", numero=" + numero + "]";
    }

}
