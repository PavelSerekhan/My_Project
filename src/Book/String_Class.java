package Book;

import JavaRush.Stream_.JavaRushStream.Size;

public class String_Class {
    public static void main(String[] args) {
        Size s = Size.SMALL;
//        System.out.println(s);
        String str = "Hello";
//        System.out.println(str.substring(0,3)); //получение подстроки
        int age = 13;
        String message = str + " " + age;
//        System.out.println(message);
        String all = String.join("/", "S", "M", "L", "XL");
        //присоединение строк, разделенные каким-либо знаком
//        System.out.println(all);

        String greeting = "Hello";
        int count = greeting.length();

//        System.out.println(count);
        int iks = greeting.codePointAt(0);
        char firstChar = greeting.charAt(0);
        char last = greeting.charAt(4);



    }
}

