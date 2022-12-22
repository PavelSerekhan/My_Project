package Book.Comparator_interface;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    public static void main(String[] args) {
        String[] friends = {"Polina","Pavel","Vika", "iki"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.length()- o2.length();
    }
}
