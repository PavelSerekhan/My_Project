package Senla.Tank;

public class Engine implements IProductPart{
    private String serialNumber;
    private int power;

    public Engine(String serialNumber, int power) {
        this.serialNumber = serialNumber;
        this.power = power;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return  "{serialNumber= '" + serialNumber + '\'' +
                ", power= " + power +
                '}';
    }
}
