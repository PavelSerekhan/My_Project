package Book;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Testirovanie {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("java_full_stack_codes", "_");
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
