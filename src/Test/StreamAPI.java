package Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"One","Two","Three","Four","Five","Six","Seven");

        Stream stream = list.stream();
        stream.filter(x -> x.toString().length() == 3).forEach(System.out::println);
//        list.stream().forEach(x-> System.out.println(x));
    }
}
