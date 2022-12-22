package Lessom_1_Level_10;

public class Lawyer implements Employee{
    public Lawyer() {
        System.out.println("Юрист взят в штат.");
    }

    @Override
    public void work() {
        System.out.println("Решение юридических вопросов...");
    }
}
