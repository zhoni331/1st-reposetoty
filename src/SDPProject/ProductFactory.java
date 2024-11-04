package SDPProject;

public abstract class ProductFactory {
    public abstract Product createProduct(String name, double price);
}

class PhoneFactory extends ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Phone(name, price);
    }
}

class LaptopFactory extends ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Laptop(name, price);
    }
}

