package Lessom_1_Level_10;

public class SuperClass {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120,40);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();


//        seat.up();
//        seat.down();
//        peugeot.start();
//        handleBar.left();
//        handleBar.right();
//        seat.getSeatParam();
    }
}
