package Senla.Tank;

public class Body implements IProductPart{
    private String serialNumber;
    private String color;

    public Body(String serialNumber, String color) {
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{serialNumber= '" + serialNumber + '\'' +
                ", color= '" + color + '\'' +
                '}';
    }
}
