package com.company;

public class Truck {
    int length; //длина
    int width; //ширина
    int height; // высота
    int weight; // вес

    public int getVolue(){
        int volue = length * width * height;
        System.out.println(volue);
        return volue;
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.length = 15;
        truck.width = 3;
        truck.height = 4;
        truck.getVolue();
    }

    public void gas() {
    }
}
