package com.company;

import java.util.ArrayList;

public class Employees {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Gunugerd");
        waitingEmployees.add("Evlampii");
        waitingEmployees.add("Valeri");
        waitingEmployees.add("Egorov");
        waitingEmployees.add("Bezrukov");
        waitingEmployees.add("Beznoov");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.contains(name)) {
                    waitingEmployees.set(i, null);
                }
            }
        }
    }
}
