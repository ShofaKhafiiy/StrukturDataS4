package org.demo2.task1;

import java.util.ArrayList;

public class PassengerManager {

    private ArrayList<Passenger> passengers;

    public PassengerManager() {
        passengers = new ArrayList<>();
    }

    // 1. ADD
    public void addPassenger(Passenger p) {
        passengers.add(p);
    }

    // 2. GET (by index)
    public Passenger getPassenger(int index) {
        if (index >= 0 && index < passengers.size()) {
            return passengers.get(index);
        }
        return null;
    }

    // 3. SEARCH (Linear Search by name)
    public Passenger searchByName(String name) {
        for (Passenger p : passengers) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // 4. UPDATE
    public void updatePassenger(int index, String name, String email, String phone, int age) {
        if (index >= 0 && index < passengers.size()) {
            Passenger p = passengers.get(index);
            p.setName(name);
            p.setEmail(email);
            p.setPhone(phone);
            p.setAge(age);
        }
    }

    // 5a. REMOVE by index
    public void removeByIndex(int index) {
        if (index >= 0 && index < passengers.size()) {
            passengers.remove(index);
        }
    }

    // 5b. REMOVE by ID
    public void removeById(int id) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassengerId() == id) {
                passengers.remove(i);
                break;
            }
        }
    }

    // 6. DISPLAY ALL
    public void displayAll() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers found.");
            return;
        }

        System.out.println("=== Passenger List ===");
        for (Passenger p : passengers) {
            p.displayInfo();
        }
    }

    // tambahan
    public int size() {
        return passengers.size();
    }
}