package org.demo2.task1;

public class Main {

    public static void main(String[] args) {

        PassengerManager manager = new PassengerManager();

        // ADD
        manager.addPassenger(new Passenger("Andi", "andi@mail.com", "0811", 20));
        manager.addPassenger(new Passenger("Budi", "budi@mail.com", "0822", 25));
        manager.addPassenger(new Passenger("Citra", "citra@mail.com", "0833", 22));

        // DISPLAY ALL
        manager.displayAll();

        // GET
        System.out.println("=== Get Passenger Index 1 ===");
        Passenger p = manager.getPassenger(1);
        if (p != null) {
            p.displayInfo();
        }

        // SEARCH
        System.out.println("=== Search Passenger (Budi) ===");
        Passenger found = manager.searchByName("Budi");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Passenger not found.");
        }

        // UPDATE
        System.out.println("=== Update Passenger Index 1 ===");
        manager.updatePassenger(1, "Budi Updated", "budi@new.com", "0899", 30);
        manager.displayAll();

        // REMOVE by INDEX
        System.out.println("=== Remove Index 0 ===");
        manager.removeByIndex(0);
        manager.displayAll();

        // REMOVE by ID
        System.out.println("=== Remove by ID (2) ===");
        manager.removeById(2);
        manager.displayAll();
    }
}