package comShofaKhafiy.modul4;

public class MajapahitBST {

    private Node root;



    public void insert(String name) {
        root = insertRecursive(root, name);
    }

    private Node insertRecursive(Node current, String name) {

        if (current == null) {
            return new Node(name);
        }

        // Jika lebih kecil → kiri
        if (name.compareToIgnoreCase(current.name) < 0) {
            current.left = insertRecursive(current.left, name);
        }

        // Jika lebih besar → kanan
        else if (name.compareToIgnoreCase(current.name) > 0) {
            current.right = insertRecursive(current.right, name);
        }

        return current;
    }



    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node current) {

        if (current != null) {

            inorderRecursive(current.left);

            System.out.print(current.name + " -> ");

            inorderRecursive(current.right);
        }
    }


    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node current) {

        if (current != null) {

            System.out.print(current.name + " -> ");

            preorderRecursive(current.left);

            preorderRecursive(current.right);
        }
    }



    public void postorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node current) {

        if (current != null) {

            postorderRecursive(current.left);

            postorderRecursive(current.right);

            System.out.print(current.name + " -> ");
        }
    }



    public boolean search(String name) {
        return searchRecursive(root, name);
    }

    private boolean searchRecursive(Node current, String name) {

        // Tidak ditemukan
        if (current == null) {
            return false;
        }

        // Ketemu
        if (name.equalsIgnoreCase(current.name)) {
            return true;
        }

        // Cari ke kiri
        if (name.compareToIgnoreCase(current.name) < 0) {
            return searchRecursive(current.left, name);
        }

        // Cari ke kanan
        return searchRecursive(current.right, name);
    }



    public String findMin() {

        if (root == null) {
            return "Tree kosong";
        }

        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.name;
    }



    public String findMax() {

        if (root == null) {
            return "Tree kosong";
        }

        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.name;
    }



    public void delete(String name) {
        root = deleteRecursive(root, name);
    }

    private Node deleteRecursive(Node current, String name) {

        if (current == null) {
            return null;
        }

        // Cari node
        if (name.compareToIgnoreCase(current.name) < 0) {
            current.left = deleteRecursive(current.left, name);
        }

        else if (name.compareToIgnoreCase(current.name) > 0) {
            current.right = deleteRecursive(current.right, name);
        }

        // Node ditemukan
        else {

            // CASE 1: Tidak punya child
            if (current.left == null && current.right == null) {
                return null;
            }

            // CASE 2: Punya 1 child
            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            // CASE 3: Punya 2 child
            String smallestValue = findSmallest(current.right);
            current.name = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
        }

        return current;
    }

    private String findSmallest(Node root) {
        return root.left == null ? root.name : findSmallest(root.left);
    }



    public void printStructure() {

        System.out.println("\n[Structure Visualization (BST Alphabetical)]\n");

        System.out.println("        Raden Wijaya (Root)");
        System.out.println("              /       \\");
        System.out.println("     Jayanegara      Tribhuwana");
        System.out.println("       /     \\ ");
        System.out.println("Gajah Mada  Kertanegara");
        System.out.println("      \\");
        System.out.println("      Hayam Wuruk");
    }
}