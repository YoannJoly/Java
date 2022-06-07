package tp9_2_interface_difficilles.entites;

public class CompteTaux extends Compte {

    private int taux;

    public CompteTaux(String accountNumber, int accoundSold, int taux) {
        super(accountNumber, accoundSold);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux: " + taux + "%";
    }

}
