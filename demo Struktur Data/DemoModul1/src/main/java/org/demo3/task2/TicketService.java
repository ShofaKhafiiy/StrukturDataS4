package org.demo3.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TicketService {
    private Queue<String> waitingQueue = new LinkedList<>();
    private Stack<String> historyStack = new Stack<>();

    public void addPassenger ( String name){
        waitingQueue.add(name);
        System.out.println("Pasengger added to queue.");
    }

    public void displayQueue (){
        System.out.println("Current Queue:");
        if (waitingQueue.isEmpty()){
            System.out.println("Antrean Kosong");

        } else {
            int i = 1;
            for (String p : waitingQueue){
                System.out.println(i++ + "." +p);
            }
        }
    }

    public void servePassenger(){
        if (!waitingQueue.isEmpty()){
            String served = waitingQueue.poll();
            historyStack.push(served);
            System.out.println("Serving passenger: " + served);
            System.out.println("Transaction saved.");
        } else {
            System.out.println("Antrean kosong, tidak ada yang dilayani");
        }
    }

   /* public void undoLastTransaction() {
        if (!historyStack.isEmpty()) {
            String undone = historyStack.pop();
            // Masukkan kembali ke antrean paling depan (LIFO ke FIFO kembali)
            ((LinkedList<String>) waitingQueue).addFirst(undone);
            System.out.println("Undo transaction for passenger: " + undone);
        } else {
            System.out.println("No history to undo.");
        }
    }*/

    public void undoLastTransaction() {
        if (!historyStack.isEmpty()) {
            // Ambil data terakhir dari history (Stack - LIFO)
            String undone = historyStack.pop();

            // Masukkan kembali ke antrean paling BELAKANG (Queue - FIFO)
            // Sesuai contoh di gambar: Rapi, Zahra, baru Wira masuk lagi
            waitingQueue.add(undone);

            System.out.println("Undo transaction for passenger: " + undone);
        } else {
            System.out.println("No history to undo.");
        }
    }
}
