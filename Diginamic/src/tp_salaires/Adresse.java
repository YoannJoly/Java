package tp_salaires;

class Adresse {

    public Adresse(final int streetNumber, final String streetName, final int postalCode, final String city) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    int streetNumber;
    String streetName;
    int postalCode;
    String city;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(final int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    @Override
    public String toString() {        
        return streetNumber + " " + streetName + " " + postalCode + " " + city;
    }

}
