package SDPProject;

public class AddToCartCommand implements Command {
    private Cart cart;
    private Product product;
    private Inventory inventory;

    public AddToCartCommand(Cart cart, Product product, Inventory inventory) {
        this.cart = cart;
        this.product = product;
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        if (inventory.isAvailable(product, 1)) {
            cart.addProduct(product);
            inventory.reduceStock(product, 1);
        } else {
            System.out.println("Cannot add " + product.getName() + " to cart: insufficient stock.");
        }
    }
}


