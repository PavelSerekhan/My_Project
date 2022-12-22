package com.company;

public class Dog {

    public class DogIsNotReadyException extends Exception {

        public DogIsNotReadyException(String message) {
            super(message);
        }
    }

    String name;
    boolean isCollarRutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarRutOn +
                    "\n Поводок надет? " + dog.isLeashPutOn +
                    "\n Намордник надет? " + dog.isMuzzlePutOn);
        }
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        this.isCollarRutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку!");
        if (isMuzzlePutOn && isLeashPutOn && isCollarRutOn) {
            System.out.println("Ура, идем гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! " +
                    "Проверьте экипировку!");
        }
    }
}