package abstract_abstract;

public class Client extends Person{
    private String bank;

    public Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Clien Name: %s \t Bank: %s", super.getName(), bank);
    }
}
