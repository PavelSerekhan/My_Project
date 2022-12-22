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

    public void setColor(String color) {
        this.color = color;
    }

    public String getPushka() {
        return pushka;
    }

    public void setPushka(String pushka) {
        this.pushka = pushka;
    }
}
