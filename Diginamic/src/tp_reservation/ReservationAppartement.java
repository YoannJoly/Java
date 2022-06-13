package tp_reservation;

public class ReservationAppartement extends ListAppartement {

    public ReservationAppartement(final Appartement appartement, final boolean isBoocked) {
        super(appartement.getPrix(), appartement.getNbPersonnes(), appartement.getEtage(), appartement.getAdresse());
        ReservationAppartement.isBoocked = isBoocked;
    }

    private static boolean isBoocked = false;

    public boolean isBoocked() {
        return isBoocked;
    }

    public static void setBoocked(boolean isBoocked) {
        ReservationAppartement.isBoocked = isBoocked;
    }

    public static void reserver(final Adresse adresse) {

        for (final Appartement appartement : listAppartement) {
            if (appartement.getAdresse().equals(adresse)) {
                setBoocked(true);
            }
        }

        for (final Peniche peniche : listPeniche) {
            if (peniche.getAdresse().equals(adresse)) {
                setBoocked(true);
            }
        }

        for (final Maison maison : listMaison) {
            if (maison.getAdresse().equals(adresse)) {
                setBoocked(true);
            }
        }

    }

    public static void annulerReservation(final Adresse adresse) {

        for (final Appartement appartement : listAppartement) {
            if (appartement.adresse.equals(adresse)) {
                isBoocked = false;
            }
        }

        for (final Peniche peniche : listPeniche) {
            if (peniche.adresse.equals(adresse)) {
                isBoocked = false;
            }
        }

        for (final Maison maison : listMaison) {
            if (maison.adresse.equals(adresse)) {
                isBoocked = false;
            } 
        }

    }

    @Override
    public String toString() {
        return "ReservationAppartement [isBoocked=" + isBoocked + ", toString()=" + super.toString() + "]";
    }

}
