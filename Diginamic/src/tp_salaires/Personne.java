package tp_salaires;

public abstract class Personne {

    private String name;
    private String fisrtName;
    private String socialNumber;
    Adresse adresse = new Adresse(0, "", 0, "");
    ContactPerso contactPerso = new ContactPerso("", "");
    Adresse adressePro = new Adresse(0, "", 0, "");
    ContactPro contactPro = new ContactPro("", "", "", adressePro);

    public Personne(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ContactPerso getContactPerso() {
        return contactPerso;
    }

    public void setContactPerso(ContactPerso contactPerso) {
        this.contactPerso = contactPerso;
    }

    public Adresse getAdressePro() {
        return adressePro;
    }

    public void setAdressePro(Adresse adressePro) {
        this.adressePro = adressePro;
    }

    public ContactPro getContactPro() {
        return contactPro;
    }

    public void setContactPro(ContactPro contactPro) {
        this.contactPro = contactPro;
    }

}
