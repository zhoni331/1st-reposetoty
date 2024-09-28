public class Prototypedemo {
    public static void main(String[] args){
        try {
            Product OriginalProduct = new Product("Laptop", 999.99, "Electronics");
            System.out.println("Original product");
            OriginalProduct.displayProductInfo();

            Product cloneProduct = (Product) OriginalProduct.clone();
            cloneProduct.setPrice(899.89);
            cloneProduct.setName("Gaming Laptop");

            System.out.println("\nCloned Product with Modifications:");
            cloneProduct.displayProductInfo();

            // The original product remains unchanged
            System.out.println("\nOriginal Product After Cloning (Unchanged):");
            OriginalProduct.displayProductInfo();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
