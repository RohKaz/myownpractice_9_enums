public enum OrderStatus {

    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");


    OrderStatus(String status) {
    }

    @Override
    public String toString() {
        return "OrderStatus{}";
    }
}

