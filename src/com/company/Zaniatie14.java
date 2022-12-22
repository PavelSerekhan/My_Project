package com.company;

public class Zaniatie14 {
    public static void main(String[] args) {
        String[] iks = {"79","13"};
        if (iks.length == 2 ){
            int result = 0;
            try{
                result = Integer.parseInt(iks[0])/Integer.parseInt(iks[1]);
                System.out.println(iks[0] + " нацело разделить" + " на "
                        + iks[1] + " будет " + result);
            }catch (NumberFormatException e){
                System.out.println("Оба аргумента должны быть целочисленными.");
            }catch (ArithmeticException e){
                System.out.println("Деление на нуль запрещено.");
            }
        }
    }
}
