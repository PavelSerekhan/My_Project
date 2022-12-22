package Book.PotoK;

/**
 * потоки не синхронизированы между собой, каждый борется за работу (выполняются как угодно)
 */
public class Test {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();


        Thread thread = new Thread(new Runner());
        thread.setName("Наш поток"); //установить имя потока
        thread.start();

        System.out.println("Hello from main thread!" + thread.getName());
    }
}

// 2 способ
class Runner implements Runnable {  // этот способ почище!
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000); // поток переходит в режим ожидания
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

// 1 способ
//class MyThread extends Thread {  // не рекомендуется!
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Hello from MyThread " + i);
//        }
//    }

