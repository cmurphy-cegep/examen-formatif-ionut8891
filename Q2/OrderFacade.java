
public class OrderFacade {
    /**
         * Complétez */
    private Payment payment;
    private Shipping shipping;
    private Stock stock;

    public OrderFacade() {
        /**
         * Complétez */
        this.payment = new Payment();
        this.shipping = new Shipping();
        this.stock = new Stock();
    }

    public void placeOrder(String item, int quantity, String paymentDetails, String address) {
        /**
         * Complétez */
        if (payment.processPayment(paymentDetails) && stock.checkStock(item, quantity)) {
            shipping.arrangeShipping(item, quantity, address);
            System.out.println("Order placed successfully.");
            stock.updateStock(item, quantity);
            }
    }
}
