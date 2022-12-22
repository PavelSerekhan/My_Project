package com.company;

public class Programmer {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setSalary(6000);
        System.out.println("Salary programmera is: " + programmer.getSalary() + " baksov");
    }
}
