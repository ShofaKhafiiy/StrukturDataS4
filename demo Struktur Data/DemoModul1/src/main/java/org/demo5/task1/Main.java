package org.demo5.task1;


import org.demo5.task2.UserManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        InventoryManager inventory =
                new InventoryManager();

        UserManager userManager =
                new UserManager();

        int choice;



        while (true) {

            // =====================================
            // PRE LOGIN MENU
            // =====================================

            while (!userManager.isLoggedIn()) {

                System.out.println(
                        "\nWelcome to the Railway Inventory System"
                );

                System.out.println(
                        "Please select a menu:"
                );

                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");

                System.out.print(
                        "Choose menu: "
                );

                choice = input.nextInt();
                input.nextLine();



                switch (choice) {

                    case 1:

                        userManager.register(input);

                        break;



                    case 2:

                        userManager.login(input);

                        break;



                    case 3:

                        System.out.println(
                                "\nProgram finished."
                        );

                        return;



                    default:

                        System.out.println(
                                "\nInvalid menu!"
                        );
                }
            }



            // =====================================
            // POST LOGIN MENU
            // =====================================

            System.out.println(
                    "\nPlease select a menu:"
            );

            System.out.println("1. Add New Item");
            System.out.println("2. View Inventory List");
            System.out.println("3. Search Item");
            System.out.println("4. Add Item Stock");
            System.out.println("5. Remove Item");
            System.out.println("6. Update Item Price");
            System.out.println("7. View Inventory Report");
            System.out.println("8. Logout");

            System.out.print(
                    "Choose menu: "
            );

            choice = input.nextInt();
            input.nextLine();



            switch (choice) {



                // =====================================
                // ADD ITEM
                // =====================================

                case 1:

                    System.out.println("\nAdd New Item");

                    System.out.print(
                            "Enter item name: "
                    );

                    String itemName =
                            input.nextLine();

                    System.out.print(
                            "Enter initial stock: "
                    );

                    int stock =
                            input.nextInt();

                    System.out.print(
                            "Enter price: "
                    );

                    double price =
                            input.nextDouble();

                    inventory.addItem(
                            itemName,
                            stock,
                            price
                    );

                    break;



                // =====================================
                // VIEW INVENTORY
                // =====================================

                case 2:

                    inventory.viewInventory();

                    break;



                // =====================================
                // SEARCH ITEM
                // =====================================

                case 3:

                    System.out.print(
                            "\nEnter item name to search: "
                    );

                    String searchName =
                            input.nextLine();

                    inventory.searchItem(
                            searchName
                    );

                    break;



                // =====================================
                // ADD STOCK
                // =====================================

                case 4:

                    System.out.print(
                            "\nEnter item name: "
                    );

                    String stockName =
                            input.nextLine();

                    System.out.print(
                            "Enter stock to add: "
                    );

                    int addStock =
                            input.nextInt();

                    inventory.addStock(
                            stockName,
                            addStock
                    );

                    break;



                // =====================================
                // REMOVE ITEM
                // =====================================

                case 5:

                    System.out.print(
                            "\nEnter item name to remove: "
                    );

                    String removeName =
                            input.nextLine();

                    inventory.removeItem(
                            removeName
                    );

                    break;



                // =====================================
                // UPDATE PRICE
                // =====================================

                case 6:

                    System.out.print(
                            "\nEnter item name: "
                    );

                    String updateName =
                            input.nextLine();

                    System.out.print(
                            "Enter new price: "
                    );

                    double newPrice =
                            input.nextDouble();

                    inventory.updatePrice(
                            updateName,
                            newPrice
                    );

                    break;



                // =====================================
                // VIEW REPORT
                // =====================================

                case 7:

                    inventory.viewInventoryReport(
                            userManager.getLoggedInFullName()
                    );

                    break;



                // =====================================
                // LOGOUT
                // =====================================

                case 8:

                    userManager.logout();

                    break;



                default:

                    System.out.println(
                            "\nInvalid menu!"
                    );
            }
        }
    }
}