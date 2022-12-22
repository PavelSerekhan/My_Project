package abstract_abstract;

public class Employee extends Person {
    private String bank;

    public Employee(String name,String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
