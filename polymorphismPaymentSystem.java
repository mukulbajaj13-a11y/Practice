package OOPs_testing;
abstract class Payment {
    public abstract void processPayment(double amount);
}

// Subclass 1
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("✅ Processing Credit Card payment of $" + amount +
                           " using card ending with " + cardNumber.substring(cardNumber.length() - 4));
        // Here you could add real logic like connecting to a payment gateway
    }
}
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("💰 Processing UPI payment of $" + amount +
                           " via UPI ID: " + upiId);
        // Here you could add real logic like sending UPI request
    }
}
public class polymorphismPaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create payment methods
        Payment p1 = new CreditCardPayment("1234567812345678");
        Payment p2 = new UPIPayment("mukul@upi");

        // Store in an array (Polymorphism)
        Payment[] payments = { p1, p2 };

        // Process payments
        for (Payment payment : payments) {
            payment.processPayment(2500.00);
        }

	}

}
