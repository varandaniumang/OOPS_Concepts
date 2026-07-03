// 2. INHERITANCE
// CreditCardPayment IS-A Payment
public class CreditCardPayment extends Payment {
    
    private String cardNumber;
    
    CreditCardPayment(double amount, String cardNumber) {
        super(amount); // Calls parent constructor
        this.cardNumber = cardNumber;
    }
    
    // 3. POLYMORPHISM (Runtime/Overriding)
    @Override
    public void processPayment() {
        // Specific logic for Credit Card
        System.out.println("Contacting VISA Gateway...");
        System.out.println("Charging card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
