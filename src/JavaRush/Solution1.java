package JavaRush;

import java.util.ArrayList;

public class Solution1 {
    public static ArrayList<Astronaut1> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }
    public static void runWorkingProcess() {
        //напишите тут ваш код
        for (int i = 0; i < astronauts.size(); i++) {
            if (astronauts.get(i) instanceof Human1) {
                pilot((Human1) astronauts.get(i));
            } else if (astronauts.get(i) instanceof Dog1) {
                createDirection((Dog1) astronauts.get(i));
            } else if (astronauts.get(i) instanceof Cat1) {
                research((Cat1) astronauts.get(i));
            }
        }
//        pilot((Human1) astronauts.get(0));
//        pilot((Human1) astronauts.get(1));
//        createDirection((Dog1) astronauts.get(2));
//        research((Cat1) astronauts.get(3));

    }
    public static void pilot(Human1 human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog1 dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat1 cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }
    public static void createCrew() {
        astronauts.add(new Human1());
        astronauts.add(new Human1());
        astronauts.add(new Dog1());
        astronauts.add(new Cat1());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut1 astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
