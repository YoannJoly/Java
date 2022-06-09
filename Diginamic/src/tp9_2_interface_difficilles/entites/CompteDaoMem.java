package tp9_2_interface_difficilles.entites;

public class CompteDaoMem implements CompteDao {

    private Compte[] comptes = { new Compte("15454", 1200), new Compte("4546464", 2569) };

    @Override
    public Compte[] lister() {
        return comptes;
    }

    @Override
    public void sauvegarder(final Compte nvCompte) {
        final Compte[] newCompte = { comptes[0], comptes[1], nvCompte };
        comptes = newCompte;
    }

    @Override
    public boolean supprimer(final String numero) {
        for (int i = 0; i < comptes.length; i++) {
            if (comptes[i].getAccountNumber().equals(numero)) {
                comptes[i] = null;
            }
        }
        return true;
    }

    @Override
    public boolean existe(final String numero) {
        return false;
    }

    @Override
    public Compte getCompte(final String numero) {
        return null;
    }

}
