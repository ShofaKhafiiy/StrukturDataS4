package org.demo1.versi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Railway Ticket Booking ===");

        System.out.print("Enter Passenger Name    : ");
        String name = scanner.nextLine();

        System.out.print("Enter Identity Number   : ");
        Integer identity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Booking Code      : ");
        String bookingCode = scanner.nextLine();

        System.out.println("\nSelect Ticket Class:");
        System.out.println("1. ECONOMY");
        System.out.println("2. BUSINESS");
        System.out.println("3. EXECUTIVE");
        System.out.println("Enter choice: ");
        int choice = scanner.nextInt();

        TicketClass ticketClass;

        if (choice == 1) ticketClass = TicketClass.ECONOMY;
        else if (choice == 2) ticketClass = TicketClass.BUSINESS;
        else ticketClass = TicketClass.EXECUTIVE;

        /*Passenger<String> p = new Passenger<>("andi", "BUDI");*/

        Passenger<Integer> passenger = new Passenger<>(name,identity);
        Ticket <Integer> ticket = new Ticket<>(bookingCode, passenger, ticketClass);



        TicketService.printTicket(ticket);

        scanner.close();

        }
    }

