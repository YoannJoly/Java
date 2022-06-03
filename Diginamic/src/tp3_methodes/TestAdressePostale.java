package tp3_methodes;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale firstAdresse = new AdressePostale(12, "Rue de la soif", 46984, "Tourcoing");
        AdressePostale secondAdresse = new AdressePostale(36, "Rue des lilas", 36980, "Pétaouchnok");

        System.out.println(firstAdresse.city);
        System.out.println(secondAdresse);
    }

}
