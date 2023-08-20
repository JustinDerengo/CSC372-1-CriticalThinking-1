public class CheckingAccount extends BankAccount {
    protected double interestRate;

    //sub class Checking account adds an interest rate to the object.
    public CheckingAccount (String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = .15;
    }

    
}
