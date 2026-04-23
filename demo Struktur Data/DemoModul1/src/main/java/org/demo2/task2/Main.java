package org.demo2.task2;

public class Main {

    public static void main(String[] args) {

        ScheduleManager manager = new ScheduleManager();

        // ADD LAST (future schedule)
        manager.addLast(new Schedule("TRN001", "Argo Bromo", "Jakarta", "Surabaya", "08:00", 300000));
        manager.addLast(new Schedule("TRN002", "Argo Lawu", "Solo", "Jakarta", "09:00", 250000));

        // ADD FIRST (urgent schedule)
        manager.addFirst(new Schedule("TRN003", "Priority Train", "Bandung", "Jakarta", "06:00", 200000));

        manager.displayAll();

        // REMOVE FIRST
        System.out.println("\nRemove First:");
        manager.removeFirst();
        manager.displayAll();

        // REMOVE LAST
        System.out.println("\nRemove Last:");
        manager.removeLast();
        manager.displayAll();

        // SEARCH
        System.out.println("\nSearch by 'Jakarta':");
        manager.searchRoute("Jakarta");

        // ADD lagi
        manager.addLast(new Schedule("TRN004", "New Train", "Jakarta", "Yogyakarta", "12:00", 270000));

        // CLEANUP
        System.out.println("\nRemove TRN004:");
        manager.removeByTrainCode("TRN004");
        manager.displayAll();
    }
}