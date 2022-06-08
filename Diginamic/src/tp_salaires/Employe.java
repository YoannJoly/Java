package tp_salaires;

public class Employe extends Personne {

    String matricule;

    public Employe(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro, String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    

}
