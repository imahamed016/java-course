// This program demonstrates how to create and use Custom Exceptions
// in a real-world banking scenario.

// ============================================================
// CUSTOM EXCEPTION
// ============================================================
// We extend 'Exception' (Checked Exception) to force the programmer
// to handle it in a try-catch block.
class InsufficientFundsException extends Exception {

private double amount;

// Constructor
public InsufficientFundsException(String message, double amount) {
// Pass the message to the parent Exception class.
super(message);
this.amount = amount;
}


// A custom method to return the missing amount.
public double getShortfall() {
return amount;
}
}

// ============================================================
// DOMAIN CLASS
// ============================================================
class BankAccount {
private double balance;

public BankAccount(double initialBalance) {
this.balance = initialBalance;
}

public double getBalance() {
return balance;
}

// Notice the 'throws' keyword. This declares that this method
// might throw an InsufficientFundsException.
public void withdraw(double amount) throws InsufficientFundsException {
// Check for the business rule error.
if (amount > balance) {
// Calculate how much is missing.



double shortfall = amount - balance;

// Manually throw the custom exception.
throw new InsufficientFundsException(
"Withdrawal failed. Insufficient funds.", shortfall
);
}

// If no exception is thrown, proceed with the transaction.
balance -= amount;
System.out.println("Successfully withdrew: KSh " + amount);
}

public void deposit(double d) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deposit'");
}

public String getAccountHolderName() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAccountHolderName'");
}
}

// ============================================================
// MAIN CLASS
// ============================================================
public class BankingSystem {
public static void main(String[] args) {

BankAccount account = new BankAccount(5000.0);
System.out.println("Current Balance: KSh " + account.getBalance());

// We MUST use try-catch because withdraw() declares a checked exception.
try {
System.out.println("\nAttempting to withdraw KSh 10,000...");



// This will trigger the exception.
account.withdraw(10000.0);

}
catch (InsufficientFundsException e) {
// Catch the custom exception.
System.out.println("TRANSACTION DECLINED!");
System.out.println("Error Message: " + e.getMessage());
System.out.println("You are short by: KSh " + e.getShortfall());
}

System.out.println("\nChecking final balance: KSh " + account.getBalance());
}
}