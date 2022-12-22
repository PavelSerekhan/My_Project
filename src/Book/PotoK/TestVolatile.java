package Book.PotoK;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        thread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread2.shutdown();
    }
}

class MyThread2 extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}