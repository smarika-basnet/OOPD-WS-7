package WS_7;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String password;

    // Each customer has a shopping cart
    private ShoppingCart cart;

    public Customer() {
        cart = new ShoppingCart();
    }

    // Getter for cart
    public ShoppingCart getCart() {
        return cart;
    }

    // Other attributes and methods
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public void register() {
        System.out.println(name + " has registered with email " + email);
    }

    public void login() {
        System.out.println(name + " logged in successfully.");
    }

    public void viewProducts(List<Product> products) {
        System.out.println("Available Products:");
        for (Product p : products) {
            p.getDetails();
        }
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void checkout() {
        System.out.println(name + " is checking out.");
        cart.calculateTotalPrice();
    }
}
