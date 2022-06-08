package tp_salaires;

public class Commercial extends Employe {

    public static void main(String[] args) {
        System.out.println("Statut: Commercial\nMission : " + getMission() + "\nSalaire brut: "
                + getGrossSalary(1500000) + "\nSalaire net: " + getNetSalary(1500000));
    }

    public Commercial(String name, String fisrtName, String socialNumber, Adresse adresse, ContactPerso contactPerso,
            Adresse adressePro, ContactPro contactPro, String matricule) {
        super(name, fisrtName, socialNumber, adresse, contactPerso, adressePro, contactPro, matricule);
    }

    static String getMission() {
        return "Trouver de nouveaux contacts";
    }

    static double getGrossSalary(int chiffreAffaire) {
        int salaryNumber = chiffreAffaire - chiffreAffaire % 10;
        return salaryNumber * 0.05;
    }

    static double getNetSalary(int chiffreAffaire) {
        return getGrossSalary(chiffreAffaire) * 0.76;
    }

}
