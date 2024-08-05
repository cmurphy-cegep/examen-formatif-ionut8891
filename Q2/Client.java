

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        String item = "Laptop";
        int quantity = 1;
        String paymentDetails = "Credit Card";
        String address = "123 Main St, Anytown";

        orderFacade.placeOrder(item, quantity, paymentDetails, address);
    }
}
