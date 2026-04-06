package comShofaKhafiy.project;

class DoublyLinkedList<E> {

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Menambah di awal
    public void addFirst(E data) {

        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    // Menambah di akhir
    public void addLast(E data) {

        Node<E> newNode = new Node<>(data);

        if (tail == null) {
            head = tail = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    // Menghapus data pertama
    public E removeFirst() {

        if (head == null) {
            System.out.println("List kosong");
            return null;
        }

        E removed = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;
        return removed;
    }

    // Menghapus data terakhir
    public E removeLast() {

        if (tail == null) {
            System.out.println("List kosong");
            return null;
        }

        E removed = tail.data;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        size--;
        return removed;
    }

    // Mengambil elemen ke-N
    public E get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return null;
        }

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Menampilkan list
    public void printList() {

        Node<E> current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }
}