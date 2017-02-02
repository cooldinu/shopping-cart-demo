package uk.co.shopping.cart;

import org.junit.After;
import org.junit.Before;

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

}
