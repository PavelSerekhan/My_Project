package Book.Abstract_class;

public abstract class Person {

    private String name;

    /**
     * @param name Имя человека
     */

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDestination();

    public String getName() {
        return name;
    }
}
