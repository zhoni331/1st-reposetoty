package SDPProject;

public class CheckoutCommand implements Command {
    private Cart cart;
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;
    private Discount discount;

    public CheckoutCommand(Cart cart, PaymentProcessor paymentProcessor, NotificationService notificationService) {
        this.cart = cart;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    // Устанавливаем скидку
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public void execute() {
        double totalAmount = cart.calculateTotal();

        // Применение скидки, если она установлена
        if (discount != null) {
            totalAmount = discount.apply(totalAmount);
        }

        Logger.getInstance().log("Initiating checkout for amount: $" + totalAmount);

        if (paymentProcessor.processPayment(totalAmount)) {
            Logger.getInstance().log("Payment successful. Order completed.");
            notificationService.notifyObservers("Your order has been successfully placed!");
        } else {
            Logger.getInstance().log("Payment failed. Order not completed.");
            notificationService.notifyObservers("Payment failed. Please try again.");
        }
    }
}



