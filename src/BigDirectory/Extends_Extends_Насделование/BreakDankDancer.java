package Extends_Extends_Насделование;

import java.util.Arrays;
import java.util.List;

public class BreakDankDancer extends Dancer{
    public BreakDankDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую брейк-данс!");
    }

    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20);

        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        for(Dancer d : discotheque) {
            d.dance();
        }
    }
}

