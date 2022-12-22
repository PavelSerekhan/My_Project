package JavaRush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;   //сравниваем ссылки

        if (this == null)  //Переданный объект — null?
            return false;

        if (!(obj instanceof Iphone))   // Если переданный объект не типа Iphone
            return false;

        Iphone iphone = (Iphone) obj; // Операция приведения типа

        return price == iphone.price && Objects.equals(model, this.model) &&
                Objects.equals(color, this.color); // String сравнивается через equals!


    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
