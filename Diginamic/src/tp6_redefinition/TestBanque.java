package tp6_redefinition;

import tp6_redefinition.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte = new Compte("15456444154", 654);
        System.out.println(compte);        
    }
}