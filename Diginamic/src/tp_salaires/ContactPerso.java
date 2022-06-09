package tp_salaires;

class ContactPerso {
    String contactTel;
    String contactmail;

    public ContactPerso(final String contactTel, final String contactmail) {
        this.contactTel = contactTel;
        this.contactmail = contactmail;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(final String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactmail() {
        return contactmail;
    }

    public void setContactmail(final String contactmail) {
        this.contactmail = contactmail;
    }

    @Override
    public String toString() {
        return contactTel + " " + contactmail;
    }
}
