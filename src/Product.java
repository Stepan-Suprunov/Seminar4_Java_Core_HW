import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private ProductName product;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductName getProduct() {
        return product;
    }

    public void setProduct(ProductName product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(ProductName product, double price) {
        this.product = product;
        this.price = price;
        this.id = productsLis.size() + 1;
        productsLis.add(this);
    }

    public static List<Product> productsLis = new ArrayList<>();

    protected enum ProductName {PEN, PENCIL, NOTE_BOOK, PAPER, LASTIC}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product=" + product +
                ", price=" + price +
                '}';
    }
}
