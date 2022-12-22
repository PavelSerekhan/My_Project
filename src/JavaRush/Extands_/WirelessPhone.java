package JavaRush.Extands_;

public class WirelessPhone extends SomePhone{  //wire less phone - беспроводной телефон
    private int hours;

    public WirelessPhone(int year, String company, int hours) {
        super(year, company);
        this.hours = hours;
    }

}
