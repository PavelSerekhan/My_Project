package JavaRush;

import java.util.Objects;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(int dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        LuxuryAuto that = (LuxuryAuto) obj;

        if (manufactureYear != that.getManufactureYear()) return false;
        return dollarPrice != that.dollarPrice;
//        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufactureYear, dollarPrice);
    }

    public static void main(String[] args) {
        LuxuryAuto ferrariGTO = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
        LuxuryAuto ferrariSpider = new LuxuryAuto("Ferrari 335 S Spider Scaglietti", 1963, 70000000);

        System.out.println("Эти два объекта равны друг другу?");
        System.out.println(ferrariGTO.equals(ferrariSpider));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(ferrariGTO.hashCode());
        System.out.println(ferrariSpider.hashCode());
    }
}
