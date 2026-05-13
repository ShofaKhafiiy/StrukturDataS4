package org.demo4.task2;

public class EmployeeBST {

    private BSTNode root;

    public void insert(Employee employee) {

        root = insertRecursive(root, employee);
    }

    private BSTNode insertRecursive(BSTNode current,
                                    Employee employee) {

        // Jika kosong
        if (current == null) {

            return new BSTNode(employee);
        }

        // Ke kiri
        if (employee.compareTo(current.data) < 0) {

            current.left =
                    insertRecursive(current.left, employee);
        }

        // Ke kanan
        else if (employee.compareTo(current.data) > 0) {

            current.right =
                    insertRecursive(current.right, employee);
        }

        // Duplicate ID
        else {

            System.out.println(
                    "[FAILED] Employee ID already exists!"
            );
        }

        return current;
    }



    public Employee search(int employeeId) {

        BSTNode found =
                searchRecursive(root, employeeId);

        if (found != null) {

            return found.data;
        }

        return null;
    }

    private BSTNode searchRecursive(BSTNode current,
                                    int employeeId) {

        // Tidak ditemukan
        if (current == null) {

            return null;
        }

        // Ketemu
        if (employeeId == current.data.getEmployeeId()) {

            return current;
        }

        // Cari kiri
        if (employeeId < current.data.getEmployeeId()) {

            return searchRecursive(
                    current.left,
                    employeeId
            );
        }

        // Cari kanan
        return searchRecursive(
                current.right,
                employeeId
        );
    }



    public void delete(int employeeId) {

        root = deleteRecursive(root, employeeId);
    }

    private BSTNode deleteRecursive(BSTNode current,
                                    int employeeId) {

        if (current == null) {

            return null;
        }

        // Cari node
        if (employeeId < current.data.getEmployeeId()) {

            current.left =
                    deleteRecursive(
                            current.left,
                            employeeId
                    );
        }

        else if (employeeId > current.data.getEmployeeId()) {

            current.right =
                    deleteRecursive(
                            current.right,
                            employeeId
                    );
        }

        // Node ditemukan
        else {



            if (current.left == null
                    && current.right == null) {

                return null;
            }



            if (current.left == null) {

                return current.right;
            }

            if (current.right == null) {

                return current.left;
            }


            BSTNode successor =
                    findMinNode(current.right);

            current.data = successor.data;

            current.right =
                    deleteRecursive(
                            current.right,
                            successor.data.getEmployeeId()
                    );
        }

        return current;
    }



    private BSTNode findMinNode(BSTNode current) {

        while (current.left != null) {

            current = current.left;
        }

        return current;
    }



    private BSTNode findMaxNode(BSTNode current) {

        while (current.right != null) {

            current = current.right;
        }

        return current;
    }



    public Employee minimum() {

        if (root == null) {

            return null;
        }

        return findMinNode(root).data;
    }



    public Employee maximum() {

        if (root == null) {

            return null;
        }

        return findMaxNode(root).data;
    }



    public void inorderTraversal() {

        inorderRecursive(root);
    }

    private void inorderRecursive(BSTNode current) {

        if (current == null) {

            return;
        }

        inorderRecursive(current.left);

        System.out.println(current.data);

        inorderRecursive(current.right);
    }



    public void preorderTraversal() {

        preorderRecursive(root);
    }

    private void preorderRecursive(BSTNode current) {

        if (current == null) {

            return;
        }

        System.out.println(current.data);

        preorderRecursive(current.left);

        preorderRecursive(current.right);
    }



    public void postorderTraversal() {

        postorderRecursive(root);
    }

    private void postorderRecursive(BSTNode current) {

        if (current == null) {

            return;
        }

        postorderRecursive(current.left);

        postorderRecursive(current.right);

        System.out.println(current.data);
    }


    public void showTree() {

        System.out.println("\n=== BST VISUALIZATION ===");

        printTree(root, 0);
    }

    private void printTree(BSTNode current,
                           int level) {

        if (current == null) {

            return;
        }

        printTree(current.right, level + 1);

        for (int i = 0; i < level; i++) {

            System.out.print("     ");
        }

        System.out.println(
                current.data.getEmployeeId()
        );

        printTree(current.left, level + 1);
    }
}