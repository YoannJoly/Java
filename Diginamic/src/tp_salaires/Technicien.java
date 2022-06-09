package tp_salaires;

public class Technicien extends Employe {

    public static void main(final String[] args) {
        System.out.println("Statut: Technicien\nMission : " + getMission() + "\nSalaire brut: " + getGrossSalary(14)
                + "\nSalaire net: " + getNetSalary(14));
    }

    public Technicien(final String name, final String fisrtName, final String socialNumber, final Adresse adresse, final ContactPerso contactPerso,
            final Adresse adressePro, final ContactPro contactPro, final String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);
    }

    static String getMission() {
        return "Fabriquer et contrôler les produits de l’entreprise";
    }

    static int getGrossSalary(final int tauxHoraire) {
        return 1607 * tauxHoraire;
    }

    static double getNetSalary(final int tauxHoraire) {
        return getGrossSalary(tauxHoraire) * 0.76;
    }

}
