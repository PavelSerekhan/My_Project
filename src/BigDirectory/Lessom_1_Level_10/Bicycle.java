package Lessom_1_Level_10;

public class Bicycle {

    private String model;
    private int weight;

//    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
//        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class HandleBar { //руль
        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }

    public class Seat { // сиденье
        public void up() {
            System.out.println("Сидение поднято выше!");
        }

        public void down() {
            System.out.println("Сидение опущено ниже!");
        }
//        public void getSeatParam(){
//            System.out.println("Параметр сиденья: диаметр подседельного штыря = " +
//                    Bicycle.this.seatPostDiameter);
//        }
    }

    class SportSeat extends Seat {

    }
}
