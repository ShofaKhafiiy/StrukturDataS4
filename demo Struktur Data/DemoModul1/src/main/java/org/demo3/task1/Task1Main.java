package org.demo3.task1;

import java.util.Scanner;



public class Task1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathLogic logic = new MathLogic();
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU MATH PROCESSOR ===");
            System.out.println("1. Masuk");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            String mainChoice = sc.nextLine();

            if (mainChoice.equals("1")) {
                boolean repeatCalculation = true;

                while (repeatCalculation) {
                    System.out.print("\nMasukkan ekspresi infix: ");
                    String input = sc.nextLine();

                    try {
                        String postfix = logic.infixToPostfix(input);
                        double result = logic.evaluatePostfix(postfix);

                        System.out.println("Infix   : " + input);
                        System.out.println("Postfix : " + postfix);

                        // Menampilkan hasil (cek apakah bulat atau desimal)
                        if (result == (long) result) {
                            System.out.println("Result  : " + (long) result);
                        } else {
                            System.out.println("Result  : " + result);
                        }
                    } catch (Exception e) {
                        System.out.println("Error: Format ekspresi tidak valid!");
                    }

                    // Iterasi pertanyaan mengulang
                    System.out.print("\nApakah ingin mengulang? (y/n): ");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("n")) {
                        repeatCalculation = false;
                        running = false; // Sesuai permintaan: program akan selesai
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