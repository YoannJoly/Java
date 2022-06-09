package tp_salaires;

class ContactPro {
    String contactTel;
    String contactMail;
    String service;
    Adresse adresseSociety = new Adresse(0, "", 0, "");

    public ContactPro(final String contactTel, final String contactMail, final String service, final Adresse adresseSociety) {
        this.contactTel = contactTel;
        this.contactMail = contactMail;
        this.service = service;
        this.adresseSociety = adresseSociety;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(final String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(final String contactMail) {
        this.contactMail = contactMail;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }

    public Adresse getAdresseSociety() {
        return adresseSociety;
    }

    public void setAdresseSociety(final Adresse adresseSociety) {
        this.adresseSociety = adresseSociety;
    }

    @Override
    public String toString() {
        return contactMail + " " + contactTel + " " + service + " " + adresseSociety;
    }

}
