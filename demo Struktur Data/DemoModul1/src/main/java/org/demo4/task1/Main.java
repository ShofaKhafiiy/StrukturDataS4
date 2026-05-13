package org.demo4.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        StationHierarchy hierarchy =
                new StationHierarchy();



        StationNode root =
                new StationNode(
                        "ST001",
                        "Gambir Central",
                        "Jakarta"
                );

        hierarchy.setRoot(root);



        hierarchy.addStation(
                "ST001",
                new StationNode(
                        "ST002",
                        "Bandung Station",
                        "West Java"
                )
        );

        hierarchy.addStation(
                "ST001",
                new StationNode(
                        "ST003",
                        "Surabaya Station",
                        "East Java"
                )
        );

        hierarchy.addStation(
                "ST002",
                new StationNode(
                        "ST004",
                        "Cimahi Station",
                        "West Java"
                )
        );

        hierarchy.addStation(
                "ST002",
                new StationNode(
                        "ST005",
                        "Garut Station",
                        "West Java"
                )
        );

        hierarchy.addStation(
                "ST003",
                new StationNode(
                        "ST006",
                        "Malang Station",
                        "East Java"
                )
        );

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println(" STATION HIERARCHY SYSTEM ");
            System.out.println("==================================");

            System.out.println("1. PreOrder Traversal");
            System.out.println("2. PostOrder Traversal");
            System.out.println("3. Level Order Traversal");
            System.out.println("4. Add Station");
            System.out.println("5. Search Station");
            System.out.println("6. Remove Station");
            System.out.println("7. Tree Statistics");
            System.out.println("0. Exit");

            System.out.print("\nChoose menu: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {



                case 1:

                    System.out.println(
                            "\n=== PREORDER TRAVERSAL ==="
                    );

                    hierarchy.preOrderTraversal();

                    hierarchy.showTreeStructure();

                    break;



                case 2:

                    System.out.println(
                            "\n=== POSTORDER TRAVERSAL ==="
                    );

                    hierarchy.postOrderTraversal();

                    hierarchy.showTreeStructure();

                    break;



                case 3:

                    System.out.println(
                            "\n=== LEVEL ORDER TRAVERSAL ==="
                    );

                    hierarchy.levelOrderTraversal();

                    hierarchy.showTreeStructure();

                    break;



                case 4:

                    System.out.print(
                            "Input Parent Code: "
                    );

                    String parentCode =
                            input.nextLine();

                    System.out.print(
                            "Input Station Code: "
                    );

                    String code =
                            input.nextLine();

                    System.out.print(
                            "Input Station Name: "
                    );

                    String name =
                            input.nextLine();

                    System.out.print(
                            "Input Region: "
                    );

                    String region =
                            input.nextLine();

                    StationNode newStation =
                            new StationNode(
                                    code,
                                    name,
                                    region
                            );

                    hierarchy.addStation(
                            parentCode,
                            newStation
                    );

                    hierarchy.showTreeStats();

                    break;



                case 5:

                    System.out.print(
                            "Input Station Code: "
                    );

                    String searchCode =
                            input.nextLine();

                    StationNode found =
                            hierarchy.findStation(
                                    searchCode
                            );

                    if (found != null) {

                        System.out.println(
                                "\n[SUCCESS] Station Found!"
                        );

                        System.out.println(found);

                    } else {

                        System.out.println(
                                "\n[FAILED] Station not found!"
                        );
                    }

                    break;



                case 6:

                    System.out.print(
                            "Input Station Code to remove: "
                    );

                    String deleteCode =
                            input.nextLine();

                    hierarchy.removeStation(
                            deleteCode
                    );

                    hierarchy.showTreeStats();

                    break;



                case 7:

                    hierarchy.showTreeStats();

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