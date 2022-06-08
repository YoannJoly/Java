package tp_salaires;

class ContactPerso {
    String contactTel;
    String contactmail;

    public ContactPerso(String contactTel, String contactmail) {
        this.contactTel = contactTel;
        this.contactmail = contactmail;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactmail() {
        return contactmail;
    }

    public void setContactmail(String contactmail) {
        this.contactmail = contactmail;
    }

}
