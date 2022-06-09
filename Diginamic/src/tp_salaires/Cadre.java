package tp_salaires;

public class Cadre extends Employe {

    public static void main(final String[] args) {
        System.out.println("Statut: Cadre\nMission : " + getMission() + "\nSalaire brut: " + getGrossSalary(200)
                + "\nSalaire net: " + getNetSalary(200));
    }

    public Cadre(final String name, final String fisrtName, final String socialNumber, final Adresse adresse, final ContactPerso contactPerso,
            final Adresse adressePro, final ContactPro contactPro, final String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);

    }

    static String getMission() {
        return "Gérer les projets";
    }

    static int getGrossSalary(final int tauxJournalier) {
        return 212 * tauxJournalier;
    }

    static double getNetSalary(final int tauxJournalier) {
        return getGrossSalary(tauxJournalier) * 0.76;
    }

}
