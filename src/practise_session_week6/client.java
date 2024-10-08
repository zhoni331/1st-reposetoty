package practise_session_week6;

public class client {
    public static void main(String[] args) {
        cofeeOrdercollection collection = new cofeeOrdercollection(5);
        collection.addcofeeOrder(new cofeeOrders("Latte"));
        collection.addcofeeOrder(new cofeeOrders("Cappuccino"));
        collection.addcofeeOrder(new cofeeOrders("Espresso"));

        iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            cofeeOrders coffeorder = (cofeeOrders) iterator.next();
            System.out.println(coffeorder.getTitle());
        }
    }
}
