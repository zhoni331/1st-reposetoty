package SDPProject;

public class Main {
    public static void main(String[] args) {
        // Создаем пользователя и систему уведомлений
        User user = new User("John Doe");
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(user);

        // Создаем фабрики и товары
        ProductFactory phoneFactory = new PhoneFactory();
        ProductFactory laptopFactory = new LaptopFactory();
        Product phone = phoneFactory.createProduct("iPhone 14", 999.99);
        Product laptop = laptopFactory.createProduct("MacBook Pro", 1999.99);

        // Создаем инвентарь и добавляем товары на склад
        Inventory inventory = new Inventory();
        inventory.addStock(phone, 5); // 5 телефонов на складе
        inventory.addStock(laptop, 2); // 2 ноутбука на складе

        // Создаем корзину
        Cart cart = new Cart();

        // Команды для добавления товаров с проверкой запасов
        Command addPhoneToCart = new AddToCartCommand(cart, phone, inventory);
        Command addLaptopToCart = new AddToCartCommand(cart, laptop, inventory);

        // Добавляем товары в корзину
        addPhoneToCart.execute();
        addLaptopToCart.execute();

        // Логируем содержимое корзины
        Logger.getInstance().log("Cart contents: " + cart.getProducts());

        // Создаем скидку и применяем ее при оформлении заказа
        Discount discount = new PercentageDiscount(10); // 10% скидка
        PaymentProcessor paymentProcessor = new PayPalAdapter();
        CheckoutCommand checkout = new CheckoutCommand(cart, paymentProcessor, notificationService);
        checkout.setDiscount(discount); // Устанавливаем скидку

        // Оформляем заказ
        checkout.execute();
    }
}





