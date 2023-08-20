public class BankAccount {
    public class BankAccount {
        protected String firstName;
        protected String lastName;
        protected int accountID;
        protected double balance;
    
        //constructor method to intialize class object
        public BankAccount(String firstName, String lastName, int accountID, double balance) {
            this.firstName = "";
            this.lastName = "";
            this.accountID = 0;
            this.balance = 0.0;
        }
    
        //setters to create new bank account, balance is always initialized as 0.0
        public void setFirstName (String firstName) {
            this.firstName = firstName;
        }
        public void setLastName (String lastName) {
            this.lastName = lastName;
        }
        public void setAccountID (int accountID) {
            this.accountID = accountID;
        }
    
    
        //getters to get information of bank account
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getAccountID() {
            return accountID;
        }
        public double getBalance() {
            return balance;
        }
    
        //deposit method accepts a single value double parameter and adds the value to the existing balance
        public void Deposit(double amount) {
            this.balance = this.balance + amount;
        }
    
        //withdrawal method accepts a single value double dollar amount and subtracts the paramater value from 
        //existing balance
        public void Withdrawal(double amount) {
            this.balance = this.balance - amount;
        }
    
        public void AccountSummary() {
            System.out.printf("Name on account: %s%s \n Account ID: %d \n Account Balance: %f \n", this.firstName, this.lastName, this.accountID, this.balance);
        }
    
    }
    
}