package tp7_heritage.entites;

public class CompteTaux extends Compte {

    private final int taux;

    public CompteTaux(final String accountNumber, final int accoundSold, final int taux) {
        super(accountNumber, accoundSold);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux: " + taux + "%";
    }

}
