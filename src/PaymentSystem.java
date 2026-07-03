
// DRIVER Class
public class PaymentSystem {
    
    public static void main(String[] args) {
        // POLYMORPHISM in action:
        // Reference is 'Payment' (Parent), Object is 'CreditCardPayment' (Child)
        Payment p1 = new CreditCardPayment(5000.00, "1234-5678-9876-5432");
        Payment p2 = new PayPalPayment(1100.11, "user@example.com");
        
        // The JVM decides at runtime which 'processPayment' to run
        process(p1);
        process(p2);
    }
    
    // This method demonstrates the power of polymorphism.
    // It works for ANY future payment type we add (Crypto, ApplePay, etc.)
    // without changing this code.
    public static void process(Payment p) {
        p.processPayment();
        p.printReceipt();
    }
}
