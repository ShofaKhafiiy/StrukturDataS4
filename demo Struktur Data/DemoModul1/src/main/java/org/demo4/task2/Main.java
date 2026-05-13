package org.demo4.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        EmployeeBST bst =
                new EmployeeBST();



        bst.insert(new Employee(
                50,
                "Andi",
                "Operations",
                "Manager",
                9000000
        ));

        bst.insert(new Employee(
                30,
                "Budi",
                "Maintenance",
                "Technician",
                6000000
        ));

        bst.insert(new Employee(
                70,
                "Citra",
                "Finance",
                "Supervisor",
                8500000
        ));

        bst.insert(new Employee(
                20,
                "Dewi",
                "Security",
                "Officer",
                5000000
        ));

        bst.insert(new Employee(
                40,
                "Eko",
                "Operations",
                "Staff",
                5500000
        ));

        bst.insert(new Employee(
                60,
                "Farhan",
                "HR",
                "Recruiter",
                7000000
        ));

        bst.insert(new Employee(
                80,
                "Gina",
                "IT",
                "Programmer",
                9500000
        ));

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println(" EMPLOYEE MANAGEMENT BST ");
            System.out.println("================================");

            System.out.println("1. Insert Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Minimum Employee ID");
            System.out.println("8. Maximum Employee ID");
            System.out.println("9. Show BST Visualization");
            System.out.println("0. Exit");

            System.out.print("\nChoose menu: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {


                case 1:

                    System.out.print("Employee ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Department: ");
                    String department = input.nextLine();

                    System.out.print("Position: ");
                    String position = input.nextLine();

                    System.out.print("Salary: ");
                    double salary = input.nextDouble();

                    bst.insert(
                            new Employee(
                                    id,
                                    name,
                                    department,
                                    position,
                                    salary
                            )
                    );

                    System.out.println(
                            "\n[SUCCESS] Employee inserted!"
                    );

                    bst.showTree();

                    break;



                case 2:

                    System.out.print("Input Employee ID: ");

                    int searchId =
                            input.nextInt();

                    Employee found =
                            bst.search(searchId);

                    if (found != null) {

                        System.out.println(
                                "\nEmployee Found:"
                        );

                        System.out.println(found);

                    } else {

                        System.out.println(
                                "\nEmployee not found!"
                        );
                    }

                    break;



                case 3:

                    System.out.print(
                            "Input Employee ID to delete: "
                    );

                    int deleteId =
                            input.nextInt();

                    bst.delete(deleteId);

                    System.out.println(
                            "\nEmployee deleted!"
                    );

                    bst.showTree();

                    break;



                case 4:

                    System.out.println(
                            "\n=== INORDER TRAVERSAL ==="
                    );

                    bst.inorderTraversal();

                    break;



                case 5:

                    System.out.println(
                            "\n=== PREORDER TRAVERSAL ==="
                    );

                    bst.preorderTraversal();

                    break;



                case 6:

                    System.out.println(
                            "\n=== POSTORDER TRAVERSAL ==="
                    );

                    bst.postorderTraversal();

                    break;



                case 7:

                    System.out.println(
                            "\nMinimum Employee:"
                    );

                    System.out.println(
                            bst.minimum()
                    );

                    break;



                case 8:

                    System.out.println(
                            "\nMaximum Employee:"
                    );

                    System.out.println(
                            bst.maximum()
                    );

                    break;



                case 9:

                    bst.showTree();

                    break;


                case 0:

                    System.out.println(
                            "\nProgram finished."
                    );

                    break;

                default:

                    System.out.println(
                            "\nInvalid menu!"
                    );
            }

        } while (choice != 0);
    }
}