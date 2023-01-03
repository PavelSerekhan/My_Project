package Abstract;

public class MyFirstThreadMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyFirstThread myFirstThread = new MyFirstThread();
            myFirstThread.start();
        }
    }
}
