package Alishev;

public class Person {
    String name; // по умолчанию виден всем классам в тек пакете
    protected int age; // тек класс или пакеты и производные классы даже в др пакетах
    public String address; // видно классам из тек пакета и других пакетов
    private String phone; //только в этом классе

    private static int counter = 1;
    private int id;

     public Person(){
         id = counter++;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void displayCounter(){
        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s \n", name);
    }

    void displayAge() {
        System.out.printf("Age: %d \n", age);
    }

    private void displeyAdress() {
        System.out.printf("Adress: %s \n ", address);
    }

    protected void displayPhone() {
        System.out.printf("Phone: %s \n", phone);
    }

}
