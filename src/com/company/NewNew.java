package com.company;

import java.util.ArrayList;

public class NewNew {
    public static void main(String[] args) {
        ArrayList<Runnable> list = new ArrayList<Runnable>();
        list.add (new Timer());
        list.add (new Calendars());

        for (Runnable element: list)
            element.run();
    }
}
