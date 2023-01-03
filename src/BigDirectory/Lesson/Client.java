package Lesson;

public class Client extends Person{
    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display() {
        System.out.printf("Employee Name: %s \t Bank: %s \n",super.getName(),bank);
    }
}
