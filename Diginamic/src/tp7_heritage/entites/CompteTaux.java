package tp7_heritage.entites;

public class CompteTaux extends Compte {

    private int taux = 2;

    public CompteTaux(String accountNumber, int accoundSold, int taux) {
        super(accountNumber, accoundSold);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux: " + taux + "%";
    }

}
