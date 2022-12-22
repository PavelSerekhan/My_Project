package Senla.Tank;

public class Tower implements IProductPart {
    private String color;
    private String pushka;

    public Tower(String color, String pushka) {
        this.color = color;
        this.pushka = pushka;
    }

    public String getColor() {
        return color;
    }

    public String getPushka() {
        return pushka;
    }

    @Override
    public String toString() {
        return "{color= '" + color + '\'' +
                ", pushka= '" + pushka + '\'' +
                '}';
    }
}
