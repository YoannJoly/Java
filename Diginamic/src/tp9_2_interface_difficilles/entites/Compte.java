package tp9_2_interface_difficilles.entites;

public class Compte {

    public Compte(final String accountNumber, final int accoundSold) {
        this.accountNumber = accountNumber;
        this.accoundSold = accoundSold;
    }

    private final String accountNumber;
    private final int accoundSold;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccoundSold() {
        return accoundSold;
    }

    @Override
    public String toString() {
        final String compte = accountNumber + " " + accoundSold;
        return compte;
    }

    
}