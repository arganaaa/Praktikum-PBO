/*
 * nama : ilham azrinargana pulungan
 * nim  : 24060122140130
 */
public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(5);
        System.out.println("Product Stock after purchase: " + product.getStock());
    }
}

