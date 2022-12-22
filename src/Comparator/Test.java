package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(lambo);
        cars.add(bugatti);

        Comparator speddComparator = new MaxSpeedCarComparator();
        Collections.sort(cars,speddComparator);
//        Collections.sort(cars);
        System.out.println(cars);




    }
}
