package tp2_constructor;

public class AdressePostale {

    public AdressePostale(int streetNumber, String streetName, int postalCode, String city) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    int streetNumber;
    String streetName;
    int postalCode;
    String city;

}
