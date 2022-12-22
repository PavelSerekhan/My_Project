package Lessom_1_Level_10;

import java.util.ArrayList;

public class Car {
    int height = 160;
    ArrayList doors = new ArrayList();

    public Car() {
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
    }
    class Door {
        public int getDoorHeight()
        {
            return (int)(height * 0.80);
        }
    }
}
