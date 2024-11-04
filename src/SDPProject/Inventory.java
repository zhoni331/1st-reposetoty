package SDPProject;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> stock;

    public Inventory() {
        this.stock = new HashMap<>();
    }

    // Добавление товара в склад
    public void addStock(Product product, int quantity) {
        stock.put(product, stock.getOrDefault(product, 0) + quantity);
        System.out.println(quantity + " units of " + product.getName() + " added to inventory.");
    }

    // Проверка доступного количества
    public boolean isAvailable(Product product, int quantity) {
        return stock.getOrDefault(product, 0) >= quantity;
    }

    // Уменьшение запасов после добавления в корзину
    public boolean reduceStock(Product product, int quantity) {
        if (isAvailable(product, quantity)) {
            stock.put(product, stock.get(product) - quantity);
            System.out.println(quantity + " units of " + product.getName() + " removed from inventory.");
            return true;
        } else {
            System.out.println("Insufficient stock for " + product.getName());
            return false;
        }
    }

    // Получение текущих запасов
    public int getStock(Product product) {
        return stock.getOrDefault(product, 0);
    }
}

