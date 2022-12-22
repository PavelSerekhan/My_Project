package Test;

import java.util.ArrayList;

public class InctanceOf {
    /**
     * проверяется какой на самом деле тип находится внутри переменной
     */

//    public static void main(String[] args) {

//        Object[] objects = {10, "Привет", 3.14}; // Autoboxing превратит эти значения в Integer,
//        // String и Double.
//
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] instanceof String){   // Если объект имеет тип String
//
//                String s = (String) objects[i];
//                System.out.println(s);
//            }
//        }


//        var elements = new ArrayList<>();
//        elements.add("Привет");
//        elements.add(10);
//        elements.add(new Integer[15]);
//        elements.add(new LinkageError());
//
//        checkElementsType(elements);
//    }
//
//    public static void checkElementsType(ArrayList<Object> elements) {
//        //напишите тут ваш код
//
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i) instanceof String) {
//                printString();
//            } else if (elements.get(i) instanceof Integer) {
//                printInteger();
//            } else if (elements.get(i) instanceof Integer[]) {
//                printIntegerArray();
//            } else {
//                printUnknown();
//            }
//        }
//    }
//
//    public static void printString() {
//        System.out.println("Строка");
//    }
//
//    public static void printInteger() {
//        System.out.println("Целое число");
//    }
//
//    public static void printIntegerArray() {
//        System.out.println("Массив целых чисел");
//    }
//
//    public static void printUnknown() {
//        System.out.println("Другой тип данных");
//    }


        /**
         *
         * автораспаковкой (autounboxing)-переменной примитивного типа можно присваивать
         * объект класса-обертки
         *
         * автоупаковкой (autoboxing)- переменной класса-обертки можно присваивать
         * значение примитивного типа
         */

//        int x = 7;
//        Integer y = 123;
//
//        x = y; //авто распаковка(autounboxing)
//        y = x * 123; //авто упаковка(autoboxing)
//    }

    /**
     * Напиши метод, который определяет, объект какого класса ему передали, и выводит на
     * экран одну из надписей: Кошка, Собака, Птица, Лампа.
     * @param args
     */
//    public static void main(String[] args) {
//        printObjectType(new Cat());
//        printObjectType(new Bird());
//        printObjectType(new Lamp());
//        printObjectType(new Cat());
//        printObjectType(new Dog());
//    }
//
//    public static void printObjectType(Object o) {
//        //Напишите тут ваше решение
//        if(o instanceof Cat) {
//            System.out.println("Кошка");
//        }else if(o instanceof Bird) {
//            System.out.println("Птица");
//        }else if(o instanceof Lamp) {
//            System.out.println("Лампа");
//        }else if(o instanceof Dog) {
//            System.out.println("Собака");
//        }
//    }
//
//    public static class Cat {
//    }
//
//    public static class Dog {
//    }
//
//    public static class Bird {
//    }
//
//    public static class Lamp {
//    }


//    public static void main(String[] args) {
//        System.out.println(min(3,5));
//
//    }
//        public static long min(long a, long b){
//            return Math.min(a,b); // a > b ? a : b;
//        }

    /**
     * Переопредели метод setName в классе Cat так,
     * чтобы программа выдавала на экран надпись «Я - кот»
     * @param args
     */
//    public static void main(String[] args) {
//        Pet pet = new Cat();
//        pet.setName("Я - пушистик");
//        System.out.println(pet.getName());
//    }
//
//    public static class Pet {
//        protected String name;
//        public Pet() {
//        }
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//    public static class Cat extends Pet {
//        public void setName(String name) {
//            super.name = "Я-кот";
//        }
//    }
    /**
     * Напиши метод, который определяет, какой объект в него передали.
     * Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык»,
     * «Корова», «Животное».
     *
     * Примечание: постарайся определять тип животного как можно более точно.
     */
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код

        if(o.getClass().equals(Cat.class)){
            return "Кот";
        }else if (o.getClass().equals(Tiger.class)) {
            return "Тигр";
        }else if (o.getClass().equals(Lion.class)) {
            return "Лев";
        } else if(o.getClass().equals(Bull.class)){
            return "Бык";
        } else if (o.getClass().equals(Cow.class)) {
            return "Корова";
        } else
        return "Животное";
    }

    public static class Cat extends Animal {  //<--Классы наследуются!!

    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }

}



