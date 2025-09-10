package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public void calculateTotal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        totalPrice = sum;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}
