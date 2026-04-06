package comShofaKhafiy.project.modul1.codelab;




public class Codelab1 {
    public static void main(String[] args) {
        GenericTicket<String> ticket1 = new GenericTicket<>("KA-001", "Andi");
        GenericTicket<Integer> ticket2 = new GenericTicket<>(1002, "Budi");

        ticket1.displayTicket();
        ticket2.displayTicket();
    }

}
