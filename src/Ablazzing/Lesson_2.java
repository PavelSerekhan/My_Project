package Ablazzing;

public class Lesson_2 {
    public static void main(String[] args) {
        // Задача №1 Базовая
//        double growth = 1.76;
//        double weight = 90;
//        System.out.println(result(growth, weight));
//    }
//
//    public static double result(double growth, double weight) {
//        return weight / (growth * growth);
//    }

        // Задача №2
//        int ageChildren = 10;
//        if (ageChildren < 6) {
//            System.out.println("Пошел в сад");
//        } else if (ageChildren < 11) {
//            System.out.println("Пошел в младшую школу");
//        } else if (ageChildren < 17) {
//            System.out.println("Пошел в среднюю школу");
//        } else {
//            System.out.println("Пошел в университет");
//        }

        // Задача №3
//        boolean chicken = false;  //курица
//        boolean vegetables = true; // овощи
//        boolean sour = true;  // соус
//        boolean toast = true;  //хлеб
//        boolean sausage = false;  // колбаса
//        boolean eggs = true;  // яйца
//
//        boolean caesar = chicken && vegetables && sour && toast;
//        boolean olivie = vegetables && (sausage || chicken) && eggs;
//
//        if (caesar) {
//            System.out.println("сделать Цезарь");
//        } else if (olivie) {
//            System.out.println("сделать Ольвье");
//        } else if (vegetables) {
//            System.out.println("сделать Овощной");
//        } else {
//            System.out.println("У меня ничего нет");
//        }

        //Продвинутая
        // Задача №3
        //если у машины нет бензина и ничего не сломано, то берут 1000 за консультацию
        //
        boolean hasFuel = false;
        boolean hasElectricProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;

        boolean hasAnyProblem = hasElectricProblem && hasMotorProblem &&
                hasTransmissionProblem && hasWheelsProblem;

        if (!hasFuel && !hasAnyProblem) {
            System.out.println("Нет бензина, с вас 1000 рублей");
        }
        double price = 0;
        int countProblem = 0;
        double discount = 1;

        if (hasMotorProblem) {
            price += 10_000;
            countProblem++;
        }
        if (hasElectricProblem) {
            price += 5_000;
            countProblem++;
        }
        if (hasTransmissionProblem) {
            price += 4_000;
            countProblem++;
        }
        if (hasWheelsProblem) {
            price += 2_000;
            countProblem++;
        }
        if (hasTransmissionProblem && (hasMotorProblem || hasElectricProblem)) {
            discount -= 0.2;
        }
        if (countProblem == 2) {
            discount -= 0.1;
        }
        price = price * discount;
        System.out.println("С Вас " + price + " рублей!");
    }
}

