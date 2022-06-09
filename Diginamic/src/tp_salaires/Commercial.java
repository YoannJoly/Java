package tp_salaires;

public class Commercial extends Employe {

    public static void main(final String[] args) {
        System.out.println("Statut: Commercial\nMission : " + getMission() + "\nSalaire brut: "
                + getGrossSalary(1500000) + "\nSalaire net: " + getNetSalary(1500000));
    }

    public Commercial(final String name, final String fisrtName, final String socialNumber, final Adresse adresse, final ContactPerso contactPerso,
            final Adresse adressePro, final ContactPro contactPro, final String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);
    }

    static String getMission() {
        return "Trouver de nouveaux contacts";
    }

    static double getGrossSalary(final int chiffreAffaire) {
        final int salaryNumber = chiffreAffaire - chiffreAffaire % 10;
        return salaryNumber * 0.05;
    }

    static double getNetSalary(final int chiffreAffaire) {
        return getGrossSalary(chiffreAffaire) * 0.76;
    }

}
