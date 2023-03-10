package Senla.adminHotel.model;

public class Guest extends AEntity{
    private String name;
    private Integer age;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id = " + getId() +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
