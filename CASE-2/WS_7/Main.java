package WS_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create products
        Product p1 = new Product(1, "Laptop", 1200.0, 5);
        Product p2 = new Product(2, "Mouse", 25.0, 10);
        Product p3 = new Product(3, "Keyboard", 45.0, 7);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // 2. Create customer
        Customer customer = new Customer();
        customer.setName("Smarika");
        customer.setEmail("smarika@example.com");
        customer.register();
        customer.login();

        // 3. View products
        customer.viewProducts(products);

        // 4. Add products to cart
        customer.addToCart(p1, 1); // Laptop x1
        customer.addToCart(p2, 2); // Mouse x2
        customer.addToCart(p3, 1); // Keyboard x1

        // 5. View cart items
        customer.getCart().viewCartItems();

        // 6. Checkout
        customer.checkout();
    }
}
