// 2. INHERITANCE
// PayPalPayment IS-A Payment
public class PayPalPayment extends Payment {
    
    private String email;
    
    PayPalPayment(double amount, String email) {
        super(amount); // Calls parent constructor
        this.email = email;
    }
    
    // 3. POLYMORPHISM (Runtime/Overriding)
    @Override
    public void processPayment() {
        // Specific logic for PayPal
        System.out.println("Redirecting to Paypal...");
        System.out.println("Processing payment for user " + email);
    }
}
