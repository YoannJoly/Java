package tp_salaires;

public class ContactPro {
    String contactTel;
    String contactMail;
    String service;
    Adresse adresseSociety = new Adresse(0, "", 0, "");

    public ContactPro(String contactTel, String contactMail, String service, Adresse adresseSociety) {
        this.contactTel = contactTel;
        this.contactMail = contactMail;
        this.service = service;
        this.adresseSociety = adresseSociety;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Adresse getAdresseSociety() {
        return adresseSociety;
    }

    public void setAdresseSociety(Adresse adresseSociety) {
        this.adresseSociety = adresseSociety;
    }

}
