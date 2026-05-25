package org.demo5.task1;

public class InventoryItem {

    private String itemName;
    private int stock;
    private double price;



    // CONSTRUCTOR
    public InventoryItem(String itemName,
                         int stock,
                         double price) {

        this.itemName = itemName;
        this.stock = stock;
        this.price = price;
    }



    // GETTER
    public String getItemName() {
        return itemName;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }



    // SETTER
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    // DISPLAY
    @Override
    public String toString() {

        return itemName
                + " | Stock: "
                + stock
                + " | Price: Rp "
                + String.format("%,.0f", price);
    }
}