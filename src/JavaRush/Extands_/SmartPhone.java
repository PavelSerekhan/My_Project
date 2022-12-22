package JavaRush.Extands_;

public class SmartPhone extends  CellPhone{
    private String operationSystem;

    public SmartPhone(int year, String company, int hours, String operationSystem) {
        super(year, company, hours);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }
}
