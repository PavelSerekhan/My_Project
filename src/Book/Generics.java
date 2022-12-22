package Book;

public class Generics {
    public static void main(String[] args) {
    KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("one",1);
        System.out.println(keyValuePair);
    }
}

class   KeyValuePair<K,V>{
    K key;
    V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
