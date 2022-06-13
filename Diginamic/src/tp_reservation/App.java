package tp_reservation;

public class App {
    public static void main(final String[] args) {
        System.out.println("\nListe des appartements: \n" + ListAppartement.listerAppartement());
        System.out.println("\nListe des maisons: \n" + ListAppartement.listerMaison());
        System.out.println("\nListe des péniches: \n" + ListAppartement.listerPeniche());

        final ReservationAppartement appartementSelected = new ReservationAppartement(
                ListAppartement.getListAppartement().get(2));

        ReservationAppartement.reserver(appartementSelected.getAdresse());

        System.out.println("\nAppartement reservé : " + appartementSelected.getAdresse()+ "\nIl est résérvé ? "
                + appartementSelected.isBoocked());

        ReservationAppartement.annulerReservation(appartementSelected.getAdresse());

        System.out.println("\nAppartement annulé : " + appartementSelected.getAdresse()+ "\nIl est résérvé ? "
                + appartementSelected.isBoocked());
    }
}
