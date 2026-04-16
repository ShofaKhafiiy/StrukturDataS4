package org.demo1;

import java.util.LinkedList;
import java.util.Queue;

public class SimulasiCallCenter {
    public static void main(String[] args) {
        // Membuat objek antrean untuk 3 petugas
        Queue<String> cc1 = new LinkedList<>();
        Queue<String> cc2 = new LinkedList<>();
        Queue<String> cc3 = new LinkedList<>();

        System.out.println("=== SISTEM LOG CALL CENTER UMM ===");

        // --- PROSES PETUGAS CC1 ---
        System.out.println("\n[ LOG PETUGAS CC1 ]");
        prosesMasuk(cc1, "11001");
        prosesMasuk(cc1, "11011");
        prosesLayani(cc1);
        prosesMasuk(cc1, "11123");
        prosesMasuk(cc1, "11015");
        prosesLayani(cc1);
        prosesMasuk(cc1, "11331");
        System.out.println("Sisa antrean akhir CC1: " + cc1);

        // --- PROSES PETUGAS CC2 ---
        System.out.println("\n[ LOG PETUGAS CC2 ]");
        prosesMasuk(cc2, "11011");
        prosesLayani(cc2);
        prosesMasuk(cc2, "11321");
        prosesMasuk(cc2, "11250");
        prosesMasuk(cc2, "11890");
        prosesMasuk(cc2, "11765");
        prosesLayani(cc2);
        System.out.println("Sisa antrean akhir CC2: " + cc2);

        // --- PROSES PETUGAS CC3 ---
        System.out.println("\n[ LOG PETUGAS CC3 ]");
        prosesMasuk(cc3, "11543");
        prosesMasuk(cc3, "11632");
        prosesLayani(cc3);
        prosesLayani(cc3);
        prosesMasuk(cc3, "11387");
        prosesMasuk(cc3, "11289");
        prosesLayani(cc3);
        System.out.println("Sisa antrean akhir CC3: " + cc3);

        System.out.println("\n===================================");
    }

    // Fungsi pembantu untuk Enqueue
    public static void prosesMasuk(Queue<String> q, String nomor) {
        System.out.println("Masuk: " + nomor);
        q.add(nomor);
    }

    // Fungsi pembantu untuk Dequeue
    public static void prosesLayani(Queue<String> q) {
        if (!q.isEmpty()) {
            String nomor = q.poll();
            System.out.println("Layani pelanggan: " + nomor);
        }
    }
}