package com.company;

public class Test1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("");
        person1.setAge(-1);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя!");
        } else {
            this.name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Ты ввел неправильный возраст!");
        } else {
            this.age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " года");
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
