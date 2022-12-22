package Test;

public class ПОТОКИ extends Thread {
//    private boolean isActive;
//
//    public ПОТОКИ() {
//        this.isActive = true;
//    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Поток выполняет некую логику...");
        }
        System.out.println("Поток остановлен!");
    }
//    public void stopRunningThread() {
//        isActive = false;
//    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начало выполнения программы");
        ПОТОКИ thread = new ПОТОКИ();
        thread.start();
        Thread.sleep(10);
        thread.isInterrupted();
        System.out.println("Конец выполнения программы");

    }
}
