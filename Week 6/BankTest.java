public class BankTest {
public static void main(String[] args) throws InsufficientFundsException {
System.out.println("=== OPENING ACCOUNT ===");
// Create a new account with an initial balance of 5000
BankAccount myAccount = new BankAccount(5000.00);
System.out.println("Account Holder: " + myAccount.getAccountHolderName());
System.out.println("Initial Balance: KSh " + myAccount.getBalance());

System.out.println("\n=== DEPOSITING ===");
myAccount.deposit(2500.50);
myAccount.deposit(-100); // Should fail (negative amount)

System.out.println("\n=== WITHDRAWING ===");
try {
    myAccount.withdraw(2000);
    myAccount.withdraw(10000); // Should fail (insufficient funds)
} catch (InsufficientFundsException e) {
    System.out.println(e.getMessage());
}
myAccount.withdraw(-50); // Should fail (negative amount)


System.out.println("\n=== FINAL STATE ===");
System.out.println("Final Balance: KSh " + myAccount.getBalance());
}
}