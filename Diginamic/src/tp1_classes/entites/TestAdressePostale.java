package tp1_classes.entites;

public class TestAdressePostale {

    public static void main(final String[] args) {
        final AdressePostale firstAdresse = new AdressePostale();
        firstAdresse.city="Montpellier";
        final AdressePostale secondAdresse = new AdressePostale();

        System.out.println(firstAdresse.city);
        System.out.println(secondAdresse);
    }

}
