package tp_salaires;

public class App {

    // Cadre
    static ContactPerso cadreContactPerso = new ContactPerso("0236789515", "tony@truand.com");
    static Adresse cadreAdressePerso = new Adresse(4, "Rue des lilas", 19856, "Paris");
    static Adresse cadreAdressePro = new Adresse(12, "Rue du travail", 19856, "Paris");
    static ContactPro cadreContactPro = new ContactPro("0659843652", "tony.pro@truand.com", "Administratif",
            cadreAdressePro);
    static Cadre cadre = new Cadre("", "", "", cadreAdressePerso, cadreContactPerso, cadreAdressePro, cadreContactPro,
            "54gg5ed4y");

    public static void main(final String[] args) {
        cadre.setName("Truand");
        cadre.setFisrtName("Tony");
        cadre.setSocialNumber("154654");
        System.out.println("Nom: " + cadre.getName() + "\nPrénom: " + cadre.getFisrtName()
                + "\nNuméro de sécurité sociale: " + cadre.getSocialNumber() + "\nAdresse personnelle : "
                + cadreAdressePerso + "\nContact Personnel: " + cadre.getContactPerso()
                + "\nAdresse professionnelle: " + cadreAdressePro + "\nContact professionnel: "
                + cadre.getContactPro() + "\nMatricule: " + cadre.matricule + "\nStatut: Cadre\nMission : "
                + Cadre.getMission() + "\nSalaire brut: " + Cadre.getGrossSalary(200)
                + "\nSalaire net: " + Cadre.getNetSalary(200));
    }
}
