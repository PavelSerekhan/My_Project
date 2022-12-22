package Book.Enum;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: " + "(SMALL, MEDIUM, LARGE, EXTRA_LARGE).");

        String input = scanner.next().toUpperCase();
        //Enum.valueOf(Size.class, input) // возвращает константу перечислимого типа указанного
        // класса с заданным именем
        Size size = Enum.valueOf(Size.class, input);// size = будет присвоено значение input

        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());
        System.out.println(size.ordinal());

        if (size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the_.");
        }
        scanner.close();
    }
}
