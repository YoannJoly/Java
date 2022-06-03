package tp5_encapsulation.banque.entites;

public class Compte {

    public Compte(String accountNumber, int accoundSold) {
        this.accountNumber = accountNumber;
        this.accoundSold = accoundSold;
    }

    String accountNumber;
    int accoundSold;
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getAccoundSold() {
        return accoundSold;
    }

    
}
