package com.company;

public class Building {
    private String type;

    public void initialize(String type){
        this.type = type;
        System.out.println(type);

    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");


    }


}
