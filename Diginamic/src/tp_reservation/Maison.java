package tp_reservation;

public class Maison extends Appartement {

    public Maison(final int prix, final int nbPersonnes, final Adresse adresse, final boolean haveGarden) {
        super(prix, nbPersonnes, adresse);
        this.haveGarden = haveGarden;
    }

    boolean haveGarden;

    public boolean isHaveGarden() {
        return haveGarden;
    }

    public void setHaveGarden(final boolean haveGarden) {
        this.haveGarden = haveGarden;
    }

    @Override
    public String toString() {
        return "Maison [haveGarden=" + haveGarden + ", toString()=" + super.toString() + "]";
    }

}
