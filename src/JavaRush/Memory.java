package JavaRush;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32",
                null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        for (int i = array.length - 1; i > 0 ; i++) {
            for (int j = 0; j < i ; j++) {
                String str = array[1];
                
            }
            
        }

    }
}
