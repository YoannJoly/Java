package tp_salaires;

public class Cadre extends Employe {

    public static void main(String[] args) {
        System.out.println("Statut: Cadre\nMission : " + getMission() + "\nSalaire brut: " + getGrossSalary(200)
                + "\nSalaire net: " + getNetSalary(200));
    }

    public Cadre(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro, String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);

    }

    static String getMission() {
        return "Gérer les projets";
    }

    static int getGrossSalary(int tauxJournalier) {
        return 212 * tauxJournalier;
    }

    static double getNetSalary(int tauxJournalier) {
        return getGrossSalary(tauxJournalier) * 0.76;
    }

}
