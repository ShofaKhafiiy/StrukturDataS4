package org.demo1.versi1;

public class TicketService {
    public static void printTicket (Ticket <?> ticket){
        System.out.println("\n=== Ticket Information ===");
        System.out.println("Booking Code    : "+ticket.getBookingCode());
        System.out.println("Passenger Name  : "+ticket.getPassenger().getName());
        System.out.println("Identity Type   : "+ticket.getPassenger().getIdentityType());
        System.out.println("Identity Number : "+ticket.getPassenger().getIdentityNumber());
        System.out.println("Ticket Class    : "+ticket.getTicketClass());
    }
}
