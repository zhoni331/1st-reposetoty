package SDPProject;

public class RemoveFromCartCommand implements Command {
    private Cart cart;
    private Product product;

    public RemoveFromCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
    }
}

