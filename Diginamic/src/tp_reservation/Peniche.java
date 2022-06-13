package tp_reservation;

public class Peniche extends Appartement {

    public Peniche(final int prix, final int nbPersonnes, final int etage, final Adresse adresse, final int longueur) {
        super(prix, nbPersonnes, etage, adresse);
        this.longueur = longueur;
    }

    int longueur;

}
