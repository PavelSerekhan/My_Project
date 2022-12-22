package Book.PotoK;

public class SunhroBLock {
    private static int counter;

    public static void test(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    counter = 0;
                    for (int i = 0; i < 5; i++) {
                        counter = counter + 1;
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                    }
                }
            }
        };
    }


    public static void main(String[] args) {


    }
}
