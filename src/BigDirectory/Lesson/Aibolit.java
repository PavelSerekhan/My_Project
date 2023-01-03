package Lesson;

import java.util.Scanner;

public class Aibolit {
    //    public void healLion(Lion lion){
//        System.out.println("Лев здоров!");
//    }
//    public void healTiger(Tiger tiger){
//        System.out.println("Тигр здоров!");
//    }
//    public void healCheetach(Cheetach cheetach){
//        System.out.println("Гепард здоров!");
//    }
//    public void healCat(Cat cat){
//        System.out.println("Пациент здоров!");
//        cat.run();
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(i);
            }
        }
    }
}
