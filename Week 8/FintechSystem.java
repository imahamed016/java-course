// This program applies Abstract Classes and Polymorphism to a Fintech scenario.

// Abstract Superclass



abstract class PaymentMethod {
protected String accountName;

public PaymentMethod(String accountName) {
this.accountName = accountName;
}

// Abstract method: Forces all payment types to implement their own processing logic.
public abstract void processPayment(double amount);
}

// Subclass 1
class MpesaPayment extends PaymentMethod {
private String phoneNumber;

public MpesaPayment(String accountName, String phoneNumber) {
super(accountName);
this.phoneNumber = phoneNumber;
}

@Override
public void processPayment(double amount) {
System.out.println("Processing M-Pesa payment of KSh " + amount + " for " +
accountName);
System.out.println(" Sending STK push to: " + phoneNumber);
}



}

// Subclass 2
class CardPayment extends PaymentMethod {
private String cardNumber;

public CardPayment(String accountName, String cardNumber) {
super(accountName);
this.cardNumber = cardNumber;
}

@Override
public void processPayment(double amount) {
System.out.println("Processing Credit Card payment of KSh " + amount + " for " +
accountName);
// Mask the card number for security
System.out.println(" Charging card ending in: " +
cardNumber.substring(cardNumber.length() - 4));
}
}

public class FintechSystem {
public static void main(String[] args) {

// Create an array of the abstract type 'PaymentMethod'.
// This is the power of polymorphism.
PaymentMethod[] cart = new PaymentMethod[3];


cart[0] = new MpesaPayment("Alice", "0712345678");
cart[1] = new CardPayment("Bob", "1234567812345678");
cart[2] = new MpesaPayment("Charlie", "0798765432");

double totalRevenue = 0.0;

System.out.println("=== PROCESSING TRANSACTIONS ===");

// Loop through the array.
for (int i = 0; i < cart.length; i++) {
double amount = 1500.0; // Assume each pays 1500

// The specific processPayment method is called based on the actual object.
cart[i].processPayment(amount);
totalRevenue += amount;
System.out.println("-------------------------");
}

System.out.println("Total Revenue Collected: KSh " + totalRevenue);
}
}