package tp2_constructor;

public class AdressePostale {

    public AdressePostale(final int streetNumber, final String streetName, final int postalCode, final String city) {
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
