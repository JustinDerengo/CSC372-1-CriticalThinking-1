public class Main {
    
    public static void main (String[] args) {
        
        CheckingAccount checkingAccount = new CheckingAccount(null, null, 0, 0, 0);
        
        checkingAccount.setFirstName("Justin");
        checkingAccount.setLastName("Derengo");
        checkingAccount.setAccountID(12345678);

        checkingAccount.accountSummary();
        checkingAccount.displayAccount();

        checkingAccount.deposit(500);
        checkingAccount.displayAccount();

        checkingAccount.withdrawal(600);
        checkingAccount.displayAccount();
        checkingAccount.withdrawal(400);
        checkingAccount.displayAccount();
        checkingAccount.processWithdrawal(300);
        checkingAccount.displayAccount();
    }

}
