package tp_salaires;

public class Technicien extends Employe {

    public static void main(String[] args) {
        System.out.println("Statut: Technicien\nMission : " + getMission() + "\nSalaire brut: " + getGrossSalary(14)
                + "\nSalaire net: " + getNetSalary(14));
    }

    public Technicien(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro, String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);
    }

    static String getMission() {
        return "Fabriquer et contrôler les produits de l’entreprise";
    }

    static int getGrossSalary(int tauxHoraire) {
        return 1607 * tauxHoraire;
    }

    static double getNetSalary(int tauxHoraire) {
        return getGrossSalary(tauxHoraire) * 0.76;
    }

}
