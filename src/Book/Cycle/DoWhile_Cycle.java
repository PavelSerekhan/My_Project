package Book.Cycle;

import java.util.Scanner;

public class DoWhile_Cycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько денег нужно на пенсию?");
        double qoal = in.nextDouble();  //цель
        System.out.println("Сколько денег вы будете вносить каждый год?");
        double payment = in.nextDouble(); // оплата
        System.out.println("Процентная ставка в % ");
        double interestRate = in.nextDouble();  //процентная ставка

        double balance = 0;
        int year = 0;

        String input;
        do {
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;
            year ++;
            System.out.printf("После года %d, твой баланс %,.2f%n",year, balance);
            System.out.println("Готов на пенсию, (Д/Н");
            input = in.nextLine();
        } while (input.equals("Н"));
    }
}
