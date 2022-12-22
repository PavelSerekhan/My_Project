package Enum_Enum;
//SUMMER, WINTER - это объекты enum Season

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
