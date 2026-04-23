package org.demo2.task1;

public class Passenger {

    private String name;
    private String email;
    private String phone;
    private int passengerId;
    private int age;

    // static counter untuk auto increment
    private static int counter = 1;

    // Constructor
    public Passenger(String name, String email, String phone, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.passengerId = counter++;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display info
    public void displayInfo() {
        System.out.println("ID       : " + passengerId);
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Phone    : " + phone);
        System.out.println("Age      : " + age);
        System.out.println("----------------------------");
    }

    // toString
    @Override
    public String toString() {
        return "Passenger{" +
                "ID=" + passengerId +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                ", Age=" + age +
                '}';
    }
}