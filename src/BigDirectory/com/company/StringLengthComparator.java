package com.company;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String name, String name2) {
        return name.length() - name2.length();
    }


}
