package comShofaKhafiy.project.modul1.codelab.belajar.emun;

public class Main {

    public static void main(String[] args) {
    Order order1 = new Order("Laptop", Order.OrderStatus.PENDING);

    order1.printOrder();

        System.out.println("\nUpdate status....\n");
        order1.setStatus(Order.OrderStatus.COMPLETED);
        order1.printOrder();
    }
}
