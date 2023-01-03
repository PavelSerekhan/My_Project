package Ablazzing;

public class Lesson_2 {
    public static void main(String[] args) {
        // Задача №1 Базовая
//        double growth = 1.76;
//        double weight = 0.9;
//        System.out.println(result(growth, weight));
//    }
//
//    public static double result(double growth, double weight) {
//        return weight / (growth * growth);
//    }

        // Задача №2
//        int ageChildren = 10;
//        if (ageChildren <= 6) {
//            System.out.println("Пошел в сад");
//        } else if (ageChildren <= 11) {
//            System.out.println("Пошел в младшую школу");
//        } else if (ageChildren <= 17) {
//            System.out.println("Пошел в среднюю школу");
//        } else {
//            System.out.println("Пошел в университет");
//        }

        // Задача №3
//        boolean chicken = true    ;  //курица
//        boolean vegetables = true; // овощи
//        boolean sour = true;  // соус
//        boolean toast = false;  //хлеб
//        boolean sausage = false;  // колбаса
//        boolean eggs = true;  // яйца
//
//        if (chicken && vegetables && sour && toast == true) {
//            System.out.println("сделать Цезарь");
//        } else if (vegetables && (sausage || chicken) && eggs == true) {
//            System.out.println("сделать Ольвье");
//        } else if (vegetables == true) {
//            System.out.println("сделать Овощной");
//        } else {
//            System.out.println("У меня ничего нет");
//        }

        //Продвинутая
        // Задача №3
        boolean hasFuel = true;
        boolean hasElectricProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = true;
        int count = 0;

        if (!hasFuel) {
            System.out.println("С вас 1000 рублей!");
            count += 1000;
        } else if (!hasMotorProblem) {
            System.out.println("С вас 10000 рублей!");
            count += 10000;
        } else if (!hasElectricProblem) {
            System.out.println("С вас 5000 рублей");
            count += 5000;
        } else if (!hasTransmissionProblem) {
            System.out.println("С вас 4000 рублей");
            count += 4000;
        } else  if (!hasWheelsProblem) {
            System.out.println("С вас 2000 рублей");
            count += 2000;
        } else if (!hasTransmissionProblem && (!hasElectricProblem || !hasMotorProblem)) {

        }

    }
}
