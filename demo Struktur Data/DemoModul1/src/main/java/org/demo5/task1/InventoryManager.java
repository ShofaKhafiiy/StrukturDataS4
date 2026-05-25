package org.demo5.task1;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    // HashMap<Key, Value>
    // Key   = item name
    // Value = object InventoryItem
    private HashMap<String, InventoryItem> inventory =
            new HashMap<>();



    // =====================================
    // ADD ITEM
    // =====================================

    public void addItem(String itemName,
                        int stock,
                        double price) {

        InventoryItem item =
                new InventoryItem(
                        itemName,
                        stock,
                        price
                );




        inventory.put(itemName, item);

        System.out.println(
                "\nItem added successfully!"
        );
    }



    // =====================================
    // VIEW INVENTORY
    // =====================================

    public void viewInventory() {

        System.out.println(
                "\nInventory List"
        );

        if (inventory.isEmpty()) {

            System.out.println(
                    "Inventory is empty!"
            );

            return;
        }

        int number = 1;

        for (Map.Entry<String, InventoryItem> entry
                : inventory.entrySet()) {

            System.out.println(
                    number + ". "
                            + entry.getValue()
            );

            number++;
        }

        System.out.println(
                "\nTotal items: "
                        + inventory.size()
        );
    }



    // =====================================
    // SEARCH ITEM
    // =====================================

    public void searchItem(String itemName) {

        if (inventory.containsKey(itemName)) {

            InventoryItem item =
                    inventory.get(itemName);

            System.out.println(
                    "\nItem Found!"
            );

            System.out.println(
                    "Name  : "
                            + item.getItemName()
            );

            System.out.println(
                    "Stock : "
                            + item.getStock()
            );

            System.out.println(
                    "Price : Rp "
                            + String.format(
                            "%,.0f",
                            item.getPrice()
                    )
            );

        } else {

            System.out.println(
                    "\nItem not found!"
            );
        }
    }



    // =====================================
    // ADD STOCK
    // =====================================

    public void addStock(String itemName,
                         int stockToAdd) {

        if (inventory.containsKey(itemName)) {

            InventoryItem item =
                    inventory.get(itemName);

            int oldStock =
                    item.getStock();

            item.setStock(
                    oldStock + stockToAdd
            );

            System.out.println(
                    "\nStock updated successfully!"
            );

            System.out.println(
                    itemName
                            + ": "
                            + oldStock
                            + " -> "
                            + item.getStock()
            );

        } else {

            System.out.println(
                    "\nItem not found!"
            );
        }
    }



    // =====================================
    // REMOVE ITEM
    // =====================================

    public void removeItem(String itemName) {

        if (inventory.containsKey(itemName)) {

            InventoryItem removedItem =
                    inventory.remove(itemName);

            System.out.println(
                    "\nItem \""
                            + itemName
                            + "\" removed successfully!"
            );

            System.out.println(
                    "(Stock: "
                            + removedItem.getStock()
                            + ", Price: Rp "
                            + String.format(
                            "%,.0f",
                            removedItem.getPrice()
                    )
                            + ")"
            );

        } else {

            System.out.println(
                    "\nItem not found!"
            );
        }
    }



    // =====================================
    // UPDATE PRICE
    // =====================================

    public void updatePrice(String itemName,
                            double newPrice) {

        if (inventory.containsKey(itemName)) {

            InventoryItem item =
                    inventory.get(itemName);

            double oldPrice =
                    item.getPrice();

            item.setPrice(newPrice);

            System.out.println(
                    "\nPrice updated successfully!"
            );

            System.out.println(
                    itemName
                            + ": Rp "
                            + String.format(
                            "%,.0f",
                            oldPrice
                    )
                            + " -> Rp "
                            + String.format(
                            "%,.0f",
                            newPrice
                    )
            );

        } else {

            System.out.println(
                    "\nItem not found!"
            );
        }
    }



    // =====================================
    // INVENTORY REPORT
    // =====================================

    public void viewInventoryReport(String user) {

        System.out.println(
                "\nInventory Report:"
        );

        for (InventoryItem item
                : inventory.values()) {

            System.out.println(
                    "- "
                            + item.getItemName()
                            + ": Stock = "
                            + item.getStock()
                            + ", Price = "
                            + item.getPrice()
            );
        }

        System.out.println(
                "\nLogged-in User: "
                        + user
        );
    }
}