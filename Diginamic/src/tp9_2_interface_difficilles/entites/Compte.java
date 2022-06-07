package tp9_2_interface_difficilles.entites;

public class Compte {

    public Compte(String accountNumber, int accoundSold) {
        this.accountNumber = accountNumber;
        this.accoundSold = accoundSold;
    }

    private String accountNumber;
    private int accoundSold;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccoundSold() {
        return accoundSold;
    }

    @Override
    public String toString() {
        String compte = accountNumber + " " + accoundSold;
        return compte;
    }

    
}