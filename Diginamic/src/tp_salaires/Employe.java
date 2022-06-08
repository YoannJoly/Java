package tp_salaires;

public class Employe extends Personne {

    String matricule;
    int salaire;

    public Employe(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro, String matricule, int salaire) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro);
        this.matricule = matricule;
        this.salaire = salaire;
    }

}
