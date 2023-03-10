package Comparator;


import com.company.StringLengthComparator;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Comparator<String> comparator = new StringLengthComparator() {
            public int compare(String obj1, String obj2) {
                return obj1.length() - obj2.length();
            }
        };
        Collections.sort(list,comparator);
        list.forEach(System.out::println);

//        Comparator<String> comparator1 = (String o1, String o2) -> {
//            return o1.length() - o2.length();
//        };

    }

}
//   class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }

