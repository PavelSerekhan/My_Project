package Test;

public class ElectroCar {
    private int id;

    //вложенный нестатический класс, имеет доступ к полям внешнего класса
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting!");
        }
    }

    //статичекий вложеный класс, не имеет доступа к полям, только к static полям!
    public static class Battery {
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

    // Вложенный класс который находится в методе
        class SomeClass{
            public void someMethod(){

            }
        }

        System.out.println("ElectroCar " + id + " is starting...");
    }

    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        electroCar.start();

        ElectroCar.Battery battery = new ElectroCar.Battery();
    }
}
