
// 1. ABSTRACTION and ENCAPSULATION
// Abstract class defines the blueprint.
// We cannot instantiate 'Payment' directly.
public abstract class Payment {
    
    // ENCAPSULATION: private variable
    private double amount;
    private String transactionId;
    
    public Payment(double amount) {
        this.amount = amount;
        transactionId = java.util.UUID.randomUUID().toString();
    }
    
    // ENCAPSULATION, Getter method
    public double getAmount() {
        return amount;
    }
    
    // Abstract method: Children MUST implement this logic
    public abstract void processPayment();
    
    // Concrete method: Shared by all children
    public void printReceipt() {
        System.out.println("Txn id: " + transactionId + " | Amount: Rs" + amount);
    }
}
