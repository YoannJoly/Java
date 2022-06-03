package tp1_classes.entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale firstAdresse = new AdressePostale();
        firstAdresse.city="Montpellier";
        AdressePostale secondAdresse = new AdressePostale();

        System.out.println(firstAdresse.city);
        System.out.println(secondAdresse);
    }

}
