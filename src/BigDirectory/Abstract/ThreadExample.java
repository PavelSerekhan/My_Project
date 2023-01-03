package Abstract;

public class ThreadExample extends Thread{
    public ThreadExample() {
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " закончил выполнение.");
    }

    public static void main(String[] args) {
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
    }
}
