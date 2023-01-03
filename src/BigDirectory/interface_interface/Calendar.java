package interface_interface;

import jdk.management.jfr.RecordingInfo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Calendar implements Runnable{
    @Override
    public void run() {
        var date = LocalDate.now();
        System.out.println("Сегодня " + date.getDayOfWeek());
    }

    public static void main(String[] args) {
//        Time time = new Time();
//        time.run();
//
//        Calendar calendar = new Calendar();
//        calendar.run();

//        Runnable r1 = new Calendar();
//        r1.run();
//
//        Runnable r2 = new Time();
//        r2.run();

        ArrayList<Runnable> list = new ArrayList<>();
        list.add(new Time());
        list.add(new Calendar());

        for (Runnable element : list){
            element.run();
        }
    }
}
