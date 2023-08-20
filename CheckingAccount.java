public class CheckingAccount extends BankAccount {
    protected double interestRate;

    //sub class Checking account adds an interest rate to the object.
    public CheckingAccount (String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = .15;
    }

    
    public void processWithdrawal (double amount) {
        if ((this.balance - amount) < 0) {
            this.balance = this.balance - amount - 30;
            System.out.println("An overdraft fee of  $30 has been applied to your account.");
        } else {
            this.balance = this.balance - amount;
        }
    }

    public void displayAccount() {
        System.out.printf("Name on account: %s%s \n Account ID: %d \n Account Balance: %f \n Interest Rate: %f \n", this.firstName, this.lastName, this.accountID, this.balance, this.interestRate);
    }
}
