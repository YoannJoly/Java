package tp9_2_interface_difficilles;

import java.util.Scanner;

import tp9_2_interface_difficilles.entites.Compte;
import tp9_2_interface_difficilles.entites.CompteDaoMem;

public class App {

    static CompteDaoMem compteDao = new CompteDaoMem();

    public static void main(final String[] args) {
        menu();
    }

    static void menu() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(
                    "***** Administration des comptes ***** \n 1. Lister les comptes \n 2. Ajouter un nouveau compte \n 3. Ajouter une opération à un compte \n 4. Supprimer un compte \n 99. Sortir");
            switch (in.nextInt()) {
                case 1:
                    listAccount();
                    break;
                case 2:
                    System.out.println("Ajout d'un nouveau compte");
                    newAccount();
                    break;
                case 3:
                    System.out.println("3. Ajout d'une opération à un compte");
                    break;
                case 4:
                    System.out.println("4. Suppression d'un compte");
                    deleteAccount();
                    break;
                case 99:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.err.println("Option non reconnue");
                    break;
            }
        }
    }

    static void newAccount() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Numéro de compte:");
            final String newAccountNumber = in.nextLine();
            System.out.println("Solde du compte: ");
            final int newAmmount = in.nextInt();
            compteDao.sauvegarder(new Compte(newAccountNumber, newAmmount));
            listAccount();
        }
    }

    static void listAccount() {
        System.out.println("Lister les comptes");
        for (int i = 0; i < compteDao.lister().length; i++) {
            System.out.println(compteDao.lister()[i]);
        }
    }

    static void deleteAccount() {
        listAccount();
        System.out.println("Supprimer le compte :");
        try (Scanner in = new Scanner(System.in)) {
            compteDao.supprimer(in.nextLine());
        }
        listAccount();
    }
}
