package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products");
        }

        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        totalPrice = sum;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
