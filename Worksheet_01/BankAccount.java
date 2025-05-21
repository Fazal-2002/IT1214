public class BankAccount {
    private String accountHolderName;
    private double balance;

    
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance= balance;
    }

    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    
    public void displayBalance() {
        System.out.println(accountHolderName + "'s Current Balance: Rs" + balance);
    }
	
	public static void main(String[] args){
		BankAccount account = new BankAccount("Anof",0.0);
		account.deposit(5000);
		account.withdraw(1500);
		account.displayBalance();
	}
}
