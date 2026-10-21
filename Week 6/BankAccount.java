// This class represents a Bank Account and enforces strict business rules using encapsulation.

public class BankAccount {

// Private fields
private String accountNumber;
private String accountHolderName;
private double balance;

// Constructor
public BankAccount(String accountNumber, String accountHolderName, double
initialBalance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;

// Validate initial balance
if (initialBalance >= 0) {
this.balance = initialBalance;
} else {



this.balance = 0;
System.out.println("Warning: Initial balance cannot be negative. Set to 0.");
}
}

// ============================================================
// GETTERS (Read-only for account number and holder)
// ============================================================
public String getAccountNumber() {
return accountNumber;
}

public String getAccountHolderName() {
return accountHolderName;
}

public double getBalance() {
return balance;
}

// Note: There is NO setBalance() method!
// The balance can ONLY be changed via deposit() and withdraw().
// This prevents external classes from arbitrarily changing the balance.

// ============================================================
// BUSINESS LOGIC METHODS



// ============================================================

// Method to deposit money
public void deposit(double amount) {
// Validation: Amount must be positive
if (amount > 0) {
balance += amount;
System.out.printf("Deposited: KSh %.2f. New Balance: KSh %.2f%n", amount, balance);
} else {
System.out.println("Error: Deposit amount must be positive.");
}
}

// Method to withdraw money
public void withdraw(double amount) {
// Validation 1: Amount must be positive
if (amount <= 0) {
System.out.println("Error: Withdrawal amount must be positive.");
return; // Exit the method early
}

// Validation 2: Sufficient funds check
if (amount > balance) {
System.out.println("Error: Insufficient funds. Available balance: KSh " + balance);
return;
}


// If all validations pass, process the withdrawal
balance -= amount;
System.out.printf("Withdrew: KSh %.2f. New Balance: KSh %.2f%n", amount, balance);
}
}