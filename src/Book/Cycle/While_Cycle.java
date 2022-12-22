package Book.Cycle;

import java.util.Scanner;

public class While_Cycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько денег нужно на пенсию?");
        double qoal = in.nextDouble();
        System.out.println("Сколько денег вы будете вносить каждый год?");
        double payment = in.nextDouble();
        System.out.println("Процентная ставка в % ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < qoal){
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;
            years++;
        }
        System.out.println("Вы можете выйти на пенсию в " + years + " годы.");

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        //   ||
//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i ++;
//        }

    }
}
