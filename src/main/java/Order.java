public class Order {

    String id;
    String OrderStatus;

    public Order(String id, String OrderStatus) {
        this.id = id;
        this.OrderStatus = OrderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }
}
