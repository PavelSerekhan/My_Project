package Book;

public class StringBuilder_Class {
    public static void main(String[] args) {
        char ch = 'S';
        String str = "Pavel";
        // используется для сцепления строк, чтобы экономить память и время
        //пустой объект в качестве построителя символьной строки
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.append(" ");
        builder.append(ch);
//        builder.delete(6,7);
//        builder.insert(3,'P');
        String result = builder.toString();
        System.out.println(result);

    }
}
