package uk.co.shopping.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Created by dinesh on 02/02/2017.
 */
public class ShoppingCartService {

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
        for (Product product : products) {
            price += product.getUnitPrice();
        }
        return BigDecimal.valueOf(price)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
