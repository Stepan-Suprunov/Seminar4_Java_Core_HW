import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;
    private int id;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
        this.id = ordersList.size() + 1;
        ordersList.add(this);
    }

    public static List<Order> ordersList = new ArrayList<>();

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", product=" + product +
                ", id=" + id +
                '}';
    }

    public static Order newPurchase(String customerName, String productName, int quantity) {
        boolean flag = false;
        Customer thisCustomer = null;
        Product thisProduct = null;

        if (quantity < 1) throw new RuntimeException("Unacceptable amount");

        for (int i = 0; i < Customer.customersList.size(); i++) {
            if (Customer.customersList.get(i).getName().equals(customerName)) {
                thisCustomer = Customer.customersList.get(i);
                flag = true;
            }
        }
        if (!flag) throw new RuntimeException("No such customer found");
        flag = false;

        for (int i = 0; i < Product.productsLis.size(); i++) {
            if (Product.productsLis.get(i).getProduct().toString().equals(productName)) {
                thisProduct = Product.productsLis.get(i);
                flag = true;
            }
        }
        if (!flag) throw new RuntimeException("No such product found");
        flag = false;

        Order order = new Order(thisCustomer, thisProduct);
        return order;
    }
}
