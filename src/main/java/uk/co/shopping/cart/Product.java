package uk.co.shopping.cart;

/**
 * Model class to hold the data pertaining to a product.
 **/
public class Product {
    private long id;
    private String name;
    private double unitPrice;

    public Product(long id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
