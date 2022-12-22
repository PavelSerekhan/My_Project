package JavaRush.Extands_;

public class CellPhone extends WirelessPhone{   //сотовый телефон

    public CellPhone(int year, String company, int hours) {
        super(year, company, hours);
    }

    @Override
    public void call() {
        System.out.println("Вызываю номер " + "outputNumber");
    }

    @Override
    public void ring() {
        System.out.println("Вам звонит абонент " + "inputNumber");
    }
}
