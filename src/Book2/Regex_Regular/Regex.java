package Book2.Regex_Regular;

import Book.ExtendsOOP.Manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        // пример найти букву в словах

//        Pattern p = Pattern.compile("a");  //  шаблон
//        Matcher m = p.matcher("Jack is a boy");
//        while (m.find()) {
//            System.out.print(m.start() + " " + m.group() + " ");
//        }

//        // найти слово
//        Pattern p2 = Pattern.compile("cat");
//        Matcher m2 = p2.matcher("About cats and dogs");
//        while (m2.find()) {
//            System.out.print(m2.start() + " " + m2.group() + " ");
//        }

        //special characters - metacharacters
        //[]\^$.|?*+()   - Экранируются
//        Pattern p3 = Pattern.compile("\\Q1+1=2\\E");
//        Matcher m3 =p3.matcher("1+1=2");
//        while (m3.find()) {
//            System.out.println(m3.start() + " " + m3.group() + " ");
//        }

//        Pattern p4 = Pattern.compile("cat");
//        Matcher m4 = p4.matcher("He captured a catfish for his cat.");
//        while (m4.find()) {
//            System.out.print(m4.start() + " " + m4.group() + " ");
//        }

//        String s = "alex@mail.ru";
//        String result = s.replaceAll("\\d{4}", "2022");
//        System.out.println(result);
//        Pattern p = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
//        Matcher m = p.matcher(s);
//        System.out.println(m.matches());


//        String s = "qd 2000 sdvds 1890 erbnln 2021";
//        Pattern p = Pattern.compile("\\d{4}");
//        Matcher m = p.matcher(s);
//        while (m.find()) {
//            System.out.println(m.group());
//        }

//        String reg = "кот\\b"; //чтобы после кот ничего не было (подойдет: кот, кот, байкот)
//        String s = "котенок котяра кот котел кот байкот";
//        Pattern p = Pattern.compile(reg);
//        Matcher m = p.matcher(s);
//        int count = 0;
//        while (m.find()) {
//            count++;
//        }
//        System.out.println(count);

            
        String name = "Серехан Павел Леонтьевич 27.10.1989\n" +
                "Серехан Полина Павловна 18-01-2019\n";
        Pattern pt = Pattern.compile("\\d{2}\\W\\d{2}\\W\\d{4}");
        Matcher mt = pt.matcher(name);
        while (mt.find()) {
            String s1 = mt.group();
            String[] s1mas = s1.split("\\W");
            System.out.println(s1mas[2]);
            System.out.println("-----");
        }
    }
}
