package SDPProject;

public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double totalAmount) {
        double discountAmount = totalAmount * (percentage / 100);
        System.out.println("Applying " + percentage + "% discount: -" + discountAmount);
        return totalAmount - discountAmount;
    }
}

