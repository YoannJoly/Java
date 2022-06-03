package tp5_encapsulation.banque.entites;

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

    
}
