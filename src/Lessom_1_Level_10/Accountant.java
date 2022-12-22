package Lessom_1_Level_10;

public class Accountant implements Employee{
    public Accountant() {
        System.out.println("Бухгалтер взят в штат.");
    }

    @Override
    public void work() {
        System.out.println("Ведение бухгалтерского отчёта....");
    }
}
