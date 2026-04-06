package comShofaKhafiy.project;

class SinglyLinkedList<E> {

    // Node generik
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Menambah data di awal
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // Menambah data di akhir
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
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

        if (head == null) {
            tail = null;
        }

        size--;
        return removed;
    }

    // Menghapus data terakhir
    public E removeLast() {
        if (head == null) {
            System.out.println("List kosong");
            return null;
        }

        if (head == tail) {
            E removed = head.data;
            head = tail = null;
            size--;
            return removed;
        }

        Node<E> current = head;

        while (current.next != tail) {
            current = current.next;
        }

        E removed = tail.data;
        current.next = null;
        tail = current;

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

    // Menampilkan isi list
    public void printList() {
        Node<E> current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}