package SDPProject;
import java.util.ArrayList;
import java.util.List;
public class OrderBuilder {
    private List<Product> products;
    private String customerName;
    private String deliveryAddress;
    private double totalAmount;

    public OrderBuilder(List<Product> products) {
        this.products = products;
        this.totalAmount = calculateTotal(products);
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public Order build() {
        return new Order(products, customerName, deliveryAddress, totalAmount);
    }

    private double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
