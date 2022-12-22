package Book;


import java.util.*;

public class Generics1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Olga");

        containsElement(set, "Olga");

        Car car = new Car(1l, "BMW");
        Car car1 = new Car(1l, "audi");

        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(car1);

        final boolean b = containsElement(list, car1);
        System.out.println(b);
    }

    public static <E> boolean containsElement(Collection<E> set, E e) {
        return set.contains(e);
    }
}

class Car {
    long id;
    String model;

    public Car(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model);
    }
}
