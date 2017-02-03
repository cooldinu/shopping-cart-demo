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

    /**
     * Test the checkout process with a single apple
     * @throws Exception
     */
    @Test
    public void checkoutSingleApple() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 1, 0.6));

        assertEquals("Shopping cart checkout price ", 0.6d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process with multiple apples
     * @throws Exception
     */
    @Test
    public void checkoutThreeApples() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 3, 0.6));

        assertEquals("Shopping cart checkout price ", 1.2d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process with a single orange
     * @throws Exception
     */
    @Test
    public void checkoutSingleOrange() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(2, "Orange", 1, 0.25));

        assertEquals("Shopping cart checkout price ", 0.25d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process with multiple oranges
     * @throws Exception
     */
    @Test
    public void checkoutThreeOranges() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(2, "Orange", 3, 0.25));

        assertEquals("Shopping cart checkout price ", 0.5d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process with apples & Orange
     * @throws Exception
     */
    @Test
    public void checkoutMultipleItems() throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Apple", 3, 0.6));
        products.add(new Product(2, "Orange", 1, 0.25));

        assertEquals("Shopping cart checkout price ", 1.45d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process with empty basket
     * @throws Exception
     */
    // negative unit test cases
    @Test
    public void checkoutEmptyProducts() throws Exception {
        List<Product> products = new ArrayList<Product>();

        assertEquals("Shopping cart checkout price ", 0d, shoppingCartService.checkout(products), 0d);
    }

    /**
     * Test the checkout process by passing a null products list
     * @throws Exception
     */
    @Test
    public void checkoutProductsListIsNULL() throws Exception {
        assertEquals("Shopping cart checkout price ", 0d, shoppingCartService.checkout(null), 0d);
    }

}
