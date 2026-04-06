package comShofaKhafiy.Modul2.Codelab1;

import java.util.ArrayList;




class SorcererManager {

    private ArrayList<String> students;


    public SorcererManager() {
        students = new ArrayList<>();
    }


    public void recruitStudents() {
        students.add("king yuji");
        students.add("Fushiguro");
        students.add("Kugisaki");
        System.out.println("First Years Assembled: " + students);
    }


    public void transferStudent() {
        students.add(0, "Okkotsu");
        System.out.println("After Yuta joins: " + students);
    }


    public void identifyStudent() {
        System.out.println("Student at index 2 is: " + students.get(2));
    }


    public void possessionEvent() {
        students.set(1, "Ryomen Sukuna");
        System.out.println("Oh no, Itadori switched!: " + students);
    }


    public void shibuyaIncident() {
        students.remove(3);
        System.out.println("After the Shibuya Incident: " + students);
    }


    public void reportStatus() {
        System.out.println("Remaining students: " + students.size());
        if (!students.isEmpty()) {
            System.out.println("The fight continues!");
        }
    }


    public void cullingGame() {
        students.clear();
        System.out.println("Post-Culling Game Status: " + students);
    }
}

public class Codelab1 {
    public static void main(String[] args) {

        SorcererManager manager = new SorcererManager();

        manager.recruitStudents();
        manager.transferStudent();
        manager.identifyStudent();
        manager.possessionEvent();
        manager.shibuyaIncident();
        manager.reportStatus();
        manager.cullingGame();
    }
}
