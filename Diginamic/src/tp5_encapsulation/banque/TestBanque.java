package tp5_encapsulation.banque;

import tp5_encapsulation.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte = new Compte("15456444154", 654);
        System.out.println(compte.getAccoundSold() + " " + compte.getAccountNumber());
    }
    
}
