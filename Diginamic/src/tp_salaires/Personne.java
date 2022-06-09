package tp_salaires;

public abstract class Personne {

    private String name;
    private String fisrtName;
    private String socialNumber;
    Adresse adresse = new Adresse(0, "", 0, "");
    ContactPerso contactPerso = new ContactPerso("", "");
    Adresse adressePro = new Adresse(0, "", 0, "");
    ContactPro contactPro = new ContactPro("", "", "", adressePro);

    public Personne(final String name, final String fisrtName, final String socialNumber, final Adresse adresse, final ContactPerso contactPerso,
            final Adresse adressePro, final ContactPro contactPro) {
        this.name = name;
        this.fisrtName = fisrtName;
        this.socialNumber = socialNumber;
        this.adresse = adresse;
        this.contactPerso = contactPerso;
        this.adressePro = adressePro;
        this.contactPro = contactPro;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(final String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(final String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(final Adresse adresse) {
        this.adresse = adresse;
    }

    public ContactPerso getContactPerso() {
        return contactPerso;
    }

    public void setContactPerso(final ContactPerso contactPerso) {
        this.contactPerso = contactPerso;
    }

    public Adresse getAdressePro() {
        return adressePro;
    }

    public void setAdressePro(final Adresse adressePro) {
        this.adressePro = adressePro;
    }

    public ContactPro getContactPro() {
        return contactPro;
    }

    public void setContactPro(final ContactPro contactPro) {
        this.contactPro = contactPro;
    }

}
