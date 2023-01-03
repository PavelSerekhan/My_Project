package Lesson;

public class ElectroCar {
    private int id;

    /**
     * нестатический вложенный класс
     */
    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting...");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }
    public void start() {
        System.out.println("ElectroCar " + id + " is starting... ");
    }
}
