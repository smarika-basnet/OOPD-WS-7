package WS_7;

import java.util.HashMap;
import java.util.Map;

/**
 * ShoppingCart class represents the cart for a customer
 */
public class ShoppingCart {
    private Map<Product, Integer> cartItems;
    private double totalPrice;

    public ShoppingCart() {
        cartItems = new HashMap<>();
        totalPrice = 0;
    }

    /** Add product to the cart */
    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
        } else {
            System.out.println("Sorry, " + product.getName() + " is out of stock or insufficient quantity.");
        }
    }

    /** Remove product from the cart */
    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            System.out.println(product.getName() + " removed from cart.");
        }
    }

    /** Calculate total price of the cart */
    public void calculateTotalPrice() {
        totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    /** View items in the cart */
    public void viewCartItems() {
        System.out.println("Cart Items:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue());
        }
    }

    // Getter
    public double getTotalPrice() { return totalPrice; }
}
