package tp_salaires;

public class Employe extends Personne {

    String matricule;

    public Employe(final String name, final String fisrtName, final String socialNumber, final Adresse adresse, final ContactPerso contactPerso,
            final Adresse adressePro, final ContactPro contactPro, final String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(final String matricule) {
        this.matricule = matricule;
    }
    

}
