package JavaRush.Intefaceee;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }
    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }
    public static void playOrchestra() {
        for (MusicalInstrument plays : orchestra){
            if (plays instanceof MusicalInstrument){
                MusicalInstrument vo = (MusicalInstrument) plays;
                vo.play();
            }
        }
    }
}
