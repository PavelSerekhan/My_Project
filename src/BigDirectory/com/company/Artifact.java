package com.company;

public class Artifact {
    int number;
    String name;
    int year;

    public Artifact(int number) {
        this.number = number;

    }

    public Artifact(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Artifact(int number, String name, int year) {
        this.number = number;
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact(212121);
        Artifact artifact1 = new Artifact(212121, "Ацтеки");
        Artifact artifact2 = new Artifact(212121, "Ацтеки", 12);

    }
}
