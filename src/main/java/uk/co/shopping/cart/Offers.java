package uk.co.shopping.cart;

/**
 * Class that encapsulates different product offers.
 **/
public class Offers {

    /**
     * method to apply the buy-one-get-one-free offer
     * @param itemCount
     * @param unitPrice
     * @return price for the items after the offer is applied
     **/
    public double buyOneGetOneFree(int itemCount, double unitPrice) {
        return ((itemCount / 2) + (itemCount % 2)) * unitPrice;
    }

    /**
     * method that applies the buy three for the price of two items
     * @param itemCount
     * @param unitPrice
     * @return price for the items after the offer is applied
     **/
    public double buyThreeForPriceOfTwo(int itemCount, double unitPrice) {
        return (2 * (itemCount / 3) + (itemCount % 3)) * unitPrice;
    }

}
