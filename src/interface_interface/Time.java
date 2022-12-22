package interface_interface;

import java.time.LocalTime;

public class Time implements Runnable{

    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }
}
