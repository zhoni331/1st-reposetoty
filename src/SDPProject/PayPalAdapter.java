package SDPProject;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPalPayment;

    public PayPalAdapter() {
        this.payPalPayment = new PayPalPayment();
    }

    @Override
    public boolean processPayment(double amount) {
        return payPalPayment.makePayment(amount);
    }
}

