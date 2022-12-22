package Test;
//метод yield - уступить

public class Yield_Yield extends Thread {

    public Yield_Yield() {
        this.start();
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "закончил выполнение.");
    }

    public static void main(String[] args) {
        new Yield_Yield();
        new Yield_Yield();
        new Yield_Yield();
    }
}
