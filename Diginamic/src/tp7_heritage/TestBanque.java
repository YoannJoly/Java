package tp7_heritage;

import tp7_heritage.entites.Compte;
import tp7_heritage.entites.CompteTaux;

public class TestBanque {

    public static void main(final String[] args) {
        final Compte[] comptes = { new Compte("4594894", 200), new CompteTaux("45646", 1200, 2) };
        System.out.println(comptes[0] + " " + comptes[1]);
    }

}