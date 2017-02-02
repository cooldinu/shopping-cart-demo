package uk.co.shopping.cart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by dinesh on 02/02/2017.
 */
public class ShoppingCartTest {

    private ShoppingCartService shoppingCartService;

    @Before
    public void setup() {
        shoppingCartService = new ShoppingCartService();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void checkoutSingleApple() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 0.6));

        assertEquals("Shopping cart checkout price ", 0.6d, shoppingCartService.checkout(products), 0d);
    }

    @Test
    public void checkoutThreeApples() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 0.6));
        products.add(new Product(1, "Apple", 0.6));
        products.add(new Product(1, "Apple", 0.6));

        assertEquals("Shopping cart checkout price ", 1.8d, shoppingCartService.checkout(products), 0d);
    }

    @Test
    public void checkoutSingleOrange() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(2, "Orange", 0.25));

        assertEquals("Shopping cart checkout price ", 0.25d, shoppingCartService.checkout(products), 0d);
    }

    @Test
    public void checkoutThreeOranges() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(2, "Orange", 0.25));
        products.add(new Product(2, "Orange", 0.25));

        assertEquals("Shopping cart checkout price ", 0.5d, shoppingCartService.checkout(products), 0d);
    }

    @Test
    public void checkoutMultipleItems() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 0.6));
        products.add(new Product(1, "Apple", 0.6));
        products.add(new Product(2, "Orange", 0.25));
        products.add(new Product(1, "Apple", 0.6));

        assertEquals("Shopping cart checkout price ", 2.05d, shoppingCartService.checkout(products), 0d);
    }

}
