package org.demo2.task2;

import java.util.Iterator;
import java.util.LinkedList;

public class ScheduleManager {

    private LinkedList<Schedule> schedules;

    public ScheduleManager() {
        schedules = new LinkedList<>();
    }

    // 1. ADD FIRST
    public void addFirst(Schedule s) {
        schedules.addFirst(s);
    }

    // 1. ADD LAST
    public void addLast(Schedule s) {
        schedules.addLast(s);
    }

    // 2. REMOVE FIRST
    public void removeFirst() {
        if (!schedules.isEmpty()) {
            schedules.removeFirst();
        }
    }

    // 2. REMOVE LAST
    public void removeLast() {
        if (!schedules.isEmpty()) {
            schedules.removeLast();
        }
    }

    // 3. SEARCH (by origin / destination)
    public void searchRoute(String keyword) {
        System.out.println("Search Result:");
        for (Schedule s : schedules) {
            if (s.getOrigin().equalsIgnoreCase(keyword) ||
                    s.getDestination().equalsIgnoreCase(keyword)) {
                s.displayInfo();
            }
        }
    }

    // 4. ITERATOR TRAVERSAL
    public void displayAll() {
        System.out.println("=== Train Schedule ===");

        Iterator<Schedule> iterator = schedules.iterator();

        while (iterator.hasNext()) {
            Schedule s = iterator.next();
            s.displayInfo();
        }
    }

    // 5. CLEANUP (pakai iterator.remove)
    public void removeByTrainCode(String code) {

        Iterator<Schedule> iterator = schedules.iterator();

        while (iterator.hasNext()) {
            Schedule s = iterator.next();

            if (s.getTrainCode().equalsIgnoreCase(code)) {
                iterator.remove(); // WAJIB pakai ini
            }
        }
    }
}