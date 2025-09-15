package Exercise1;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            sale.addProduct(new Product("Product1", 10));
            sale.addProduct(new Product("Product2", 10));
            sale.calculateTotal();
            System.out.println("Total price: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sale.getProducts().get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
