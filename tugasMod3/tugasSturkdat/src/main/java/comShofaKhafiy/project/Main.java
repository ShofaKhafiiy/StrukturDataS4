package comShofaKhafiy.project;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Singly Linked List Kota ===");

        SinglyLinkedList<String> kotaList = new SinglyLinkedList<>();

        kotaList.addFirst("Malang");
        kotaList.addLast("Surabaya");
        kotaList.addLast("Jakarta");

        kotaList.printList();

        System.out.println("Kota index ke-1: " + kotaList.get(1));

        kotaList.removeFirst();
        kotaList.printList();

        kotaList.removeLast();
        kotaList.printList();


        System.out.println("\n=== Doubly Linked List Kota ===");

        DoublyLinkedList<String> kotaList2 = new DoublyLinkedList<>();

        kotaList2.addFirst("Malang");
        kotaList2.addLast("Surabaya");
        kotaList2.addLast("Jakarta");

        kotaList2.printList();

        System.out.println("Kota index ke-2: " + kotaList2.get(2));

        kotaList2.removeFirst();
        kotaList2.printList();

        kotaList2.removeLast();
        kotaList2.printList();
    }
}