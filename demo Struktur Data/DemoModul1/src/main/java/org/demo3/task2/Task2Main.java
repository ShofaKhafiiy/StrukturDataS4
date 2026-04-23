package org.demo3.task2;

import java.util.Scanner;

public class Task2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketService service = new TicketService();
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU RAILWAY TICKET SERVICE ===");
            System.out.println("1. Masuk");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            String mainChoice = sc.nextLine();

            if (mainChoice.equals("1")) {
                boolean repeatAction = true;

                while (repeatAction) {
                    System.out.println("\n--- Panel Layanan Tiket ---");
                    System.out.println("1. Add Passenger");
                    System.out.println("2. Display Queue");
                    System.out.println("3. Serve Passenger");
                    System.out.println("4. Undo Last Transaction");
                    System.out.print("Choose action: ");
                    String action = sc.nextLine();

                    switch (action) {
                        case "1":
                            System.out.print("Enter passenger name: ");
                            service.addPassenger(sc.nextLine());
                            break;
                        case "2":
                            service.displayQueue();
                            break;
                        case "3":
                            service.servePassenger();
                            break;
                        case "4":
                            service.undoLastTransaction();
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }

                    // Iterasi pertanyaan mengulang setelah melakukan aksi
                    System.out.print("\nApakah ingin melakukan transaksi lain? (y/n): ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("n")) {
                        repeatAction = false;
                        running = false; // Program berhenti sepenuhnya
                        System.out.println("Program selesai. Sampai jumpa!");
                    }
                }
            } else if (mainChoice.equals("2")) {
                running = false;
                System.out.println("Program selesai. Sampai jumpa!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        sc.close();
    }
}