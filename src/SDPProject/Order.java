package SDPProject;

import java.util.List;

public class Order {
    private List<Product> products;
    private String customerName;
    private String deliveryAddress;
    private double totalAmount;

    public Order(List<Product> products, String customerName, String deliveryAddress, double totalAmount) {
        this.products = products;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order [customerName=" + customerName + ", deliveryAddress=" + deliveryAddress +
                ", totalAmount=" + totalAmount + ", products=" + products + "]";
    }
}

