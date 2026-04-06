package comShofaKhafiy.project.modul1.codelab.belajar.emun;

public class Order {

    enum OrderStatus{
        PENDING,
        PROCESSING,
        COMPLETED,
        CANCELLED
    }
    private String orderName;
    private OrderStatus status;

    public Order(String orderName, OrderStatus orderStatus){
        this.orderName = orderName;
        this.status = orderStatus;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void printOrder (){
        System.out.println("Order: "+orderName);
        System.out.println("Status: "+status);
    }
}
