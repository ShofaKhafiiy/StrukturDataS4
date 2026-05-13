package org.demo4.task2;

public class Employee implements Comparable<Employee> {



    private int employeeId;
    private String name;
    private String department;
    private String position;
    private double salary;



    public Employee(int employeeId,
                    String name,
                    String department,
                    String position,
                    double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public int compareTo(Employee other) {

        return Integer.compare(
                this.employeeId,
                other.employeeId
        );
    }


    @Override
    public String toString() {

        return employeeId
                + " - "
                + name
                + " | "
                + department
                + " | "
                + position
                + " | Salary: "
                + salary;
    }
}