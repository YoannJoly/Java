package tp5_encapsulation.banque;

import tp5_encapsulation.banque.entites.Compte;

public class TestBanque {

    public static void main(final String[] args) {
        final Compte compte = new Compte("15456444154", 654);
        System.out.println(compte);
        System.out.println(compte.getAccoundSold() + " " + compte.getAccountNumber());
    }
}