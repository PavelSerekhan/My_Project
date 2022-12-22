package Test;

import java.util.Arrays;

public class CustomStringArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList(){
        capacity = 10;  //вместимость
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element){
        if(size == capacity){
            grow();
        }
        elements[size] = element;
        size++;
    }
    private void grow() {
        capacity = (int) (elements.length * 1.5);
        String[] arrNew = new String[capacity];
//        System.arraycopy(elements,0,arrNew,0,elements.length);
//        elements = arrNew;
        for (int i = 0; i < elements.length; i++) {
            arrNew[i] = elements[i];
        }
        elements= arrNew;
    }
}
