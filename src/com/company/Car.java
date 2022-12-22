package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();

        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        cars.add(ford);
        cars.add(fiat);
//        System.out.println(cars );
//
//        cars.addFirst(fiat);
//        cars.addLast(ferrari);
//        System.out.println(cars);

//        System.out.println(cars.pollFirst());
//        System.out.println(cars.pollLast());
//
//        System.out.println("Что осталось в списке?");
//        System.out.println(cars);


//        System.out.println(cars.peekFirst());
//        System.out.println(cars.peekLast());

        Car[] carArray = cars.toArray(new Car[5]);
        System.out.println(Arrays.toString(carArray));


    }
    @Override
    public String toString(){
        return "Car{" + "model='" + model + '\'' + '}';

    }
}
