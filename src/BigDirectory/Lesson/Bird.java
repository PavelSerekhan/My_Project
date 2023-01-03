package Lesson;

public class Bird {
    private String name;
    private int age;
    boolean sex;

    public Bird(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
}
