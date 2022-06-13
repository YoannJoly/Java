package tp_reservation;

public class Appartement {

    private final int prix;
    private final int nbPersonnes;
    private int etage;
    protected Adresse adresse;

    public Appartement(final int prix, final int nbPersonnes, final int etage, final Adresse adresse) {
        this.prix = prix;
        this.nbPersonnes = nbPersonnes;
        this.etage = etage;
        this.adresse = adresse;
    }

    public Appartement(final int prix, final int nbPersonnes, final Adresse adresse) {
        this.prix = prix;
        this.nbPersonnes = nbPersonnes;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Appartement [prix=" + prix + ", nbPersonnes=" + nbPersonnes + ", etage=" + etage + ", adresse="
                + adresse
                + "]";
    }

    public int getPrix() {
        return prix;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public int getEtage() {
        return etage;
    }

    public Adresse getAdresse() {
        return adresse;
    }

}
