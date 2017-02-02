package uk.co.shopping.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Created by dinesh on 02/02/2017.
 */
public class ShoppingCartService {

    private Offers offers;

    public ShoppingCartService() {
        offers = new Offers();
    }

    /**
     * method to checkout the items in the shopping-cart
     * @param products
     * @return total of all items in the cart
     */
    public double checkout(List<Product> products) {
        double price = 0.0d;
        if (products == null) {
            return price;
        }
        products.stream()
                .forEach(item -> applyOffers(item));
        for (Product product : products) {
            price += applyOffers(product);
        }
        return BigDecimal.valueOf(price)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    private double applyOffers(Product product) {
        if(product.getName().equals("Apple")){
            return offers.buyOneGetOneFree(product.getQuantity(), 0.60d);
        }
        else if(product.getName().equals("Orange")){
            return offers.buyThreeForPriceOfTwo(product.getQuantity(), 0.25d);
        }
        return product.getUnitPrice();
    }
}
