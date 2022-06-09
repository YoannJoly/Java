package tp9_2_interface_difficilles;

import tp9_2_interface_difficilles.entites.Compte;
import tp9_2_interface_difficilles.entites.CompteTaux;

public class TestBanque {

    public static void main(final String[] args) {
        final Compte[] comptes = { new Compte("4594894", 200), new CompteTaux("45646", 1200, 2) };
        System.out.println(comptes[0] + " " + comptes[1]);
    }

}