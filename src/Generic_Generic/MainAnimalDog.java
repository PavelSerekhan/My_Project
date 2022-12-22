package Generic_Generic;

import Comparator.Test;

import java.util.ArrayList;
import java.util.List;

public class MainAnimalDog {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        Test(listOfAnimal);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Dog());

    }
    private static void Test(List< ? extends Animal> list) { // ? означает что можно передать
        // лист любых объектов
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
