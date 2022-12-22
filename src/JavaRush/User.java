package JavaRush;

public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args) {

    }

}
