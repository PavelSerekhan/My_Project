package JavaRush;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

//    public static void main(String[] args) {
//        Entity entity = new Entity();
//        Human human = new Human();
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.eat();
//        javaDeveloper.move();
//        javaDeveloper.speak();
//        javaDeveloper.code();
//        entity.
//        Animal dog = new Dog();
//        dog.voice();


//    public static void main(String[] args) {
//        int[] intArray = getArrayTenElements();
//        System.out.println(min(intArray));
//
//    }

//    public static int min(int[] ints) {
    //напишите тут ваш код
//            Arrays.sort(ints);
//            int number = Math.min(ints[0],ints[1]);
//            return number;
//
//        int min = ints[0];
//        for (int number : ints) {
//            min = Math.min(min, number);
//        }
//        return min;
//    }

//    public static int[] getArrayTenElements() {
//        //напишите тут ваш код
//        Scanner scanner = new Scanner(System.in);
//        int[] intArray = new int[10];
//        for (int i = 0; i < 10; i++) {
//            intArray[i] = scanner.nextInt();
//        }
//        return intArray;
//    }

//    public static void main(String[] args) {
//        for (int i = 10; i > 0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Поехали");

//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("Старт!");
//    }

//        public static void setTimer( int days, int hours, int minutes, int seconds, int millis) throws
//        InterruptedException {
//            System.out.println("Таймер запущен!");
//            //напишите тут ваш код
//            TimeUnit.DAYS.sleep(days);
//            TimeUnit.HOURS.sleep(hours);
//            TimeUnit.MINUTES.sleep(minutes);
//            TimeUnit.SECONDS.sleep(seconds);
//            TimeUnit.MILLISECONDS.sleep(millis);
//            System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
//        }
//    public static int getPowerOfTwo(int power) {
//        int result = 2;
//        for(int i = 1; i < power ; i++) {
//            result = result << 2;
//        }
//        return result;
//    }

//    public static void main(String[] args) {
//        String s = "Фильм \"Друзья\" номинирован на \"Оскар\"";
//        System.out.println(s);
//        System.out.println("0\t1\t2\t3");
//        System.out.println("0\t10\t20\t30");
//        System.out.println("0\t100\t200\t300");
//        String s = "It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"";
//        String s1 = "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"";
//        System.out.println(s);
//        System.out.println(s1);


//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
//        String[] arar = path.split("/");
//        String  result = String.join("\\",arar);
//        System.out.println(result);

//        String result = path.replace('/', '\\');
//        System.out.println(result);

    //        /**
//         * Допустим, вы хотите написать программу, которая просит пользователя ввести путь к
//         * файлу и проверяет, что это за файл по его расширению. Тогда код такой программы
//         * мог бы выглядеть примерно так:
//         */
//
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
//            System.out.println("Это jpeg!");
//        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
//            System.out.println("Это HTML-страница");
//        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
//            System.out.println("Это документ Word");
//        } else
//            System.out.println("Неизвестный формат");
//    }


//    public static void main(String[] args) {
//        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org",
//                "facebook.com", "https://instagram", "codegym.cc"};
//        for (String url : urls) {
//            String protocol = checkProtocol(url);
//            String domain = checkDomain(url);
//
//            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol +
//                    ", домен - " + domain);
//        }
//    }
//
//    public static String checkProtocol(String url) {
//        //напишите тут ваш код
//        if (url.startsWith("http:")) {
//            return "http";
//        } else if (url.startsWith("https:")) {
//            return "https";
//        } else
//            return "неизвестный";
//    }
//
//    public static String checkDomain(String url) {
//        //напишите тут ваш код
//        if (url.endsWith("com")){
//            return "com";
//        } else if (url.endsWith("net")){
//            return "net";
//        } else if (url.endsWith("org")){
//            return "org";
//        } else if (url.endsWith("ru")){
//            return "ru";
//        } else
//        return "неизвестный";
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//
//        int index = path.indexOf("//");
//        int index2 = path.indexOf("/", index + 2);// получаем индекс первого
//        // вхождения строки, но ищем только после символов // index + 2
//
//        String first = path.substring(0,index + 2);
//        String last = path.substring(index2);
//
//        String result = first + "javarush.ru" + last;
//        System.out.println(result);

//    public static void main(String[] args) {
//        String path = "/usr/java/jdk1.8/bin/";
//
//        String jdk13 = "jdk-13";
//        System.out.println(changePath(path, jdk13));
//    }
//
//    public static String changePath(String path, String jdk) {
//        int firstIndex = path.indexOf("jdk");
//        int lastIndex = path.indexOf("/", firstIndex);
//        String result = path.substring(firstIndex, lastIndex);
//
////        String result = path.replaceFirst("jdk1.8",jdk);
//        //напишите тут ваш код
//
//        return path.replace(result, jdk);

//    static Integer first = 1000;
//    static Integer second = 1000;
//    static int third = 1000;

    public static void main(String[] args) {
//        Class a = "Привет".getClass();
//        System.out.println(a);
//        String string = "12.84";
//        double str = Double.parseDouble(string);
//        double strings = Double.parseDouble(string);
//        double rounds = Math.round(strings);
//        System.out.println((int)rounds);

//        Integer a = 5;
//        int x = a;

//        System.out.println(first.equals(second));
//        System.out.println(third == second);
//        System.out.println(third == first);

//        int a = Integer.MAX_VALUE;
//        System.out.println(a);
//        int b = Integer.MIN_VALUE;
//        System.out.println(b);

//        String s = "16";
//        String str = Integer.toBinaryString(Integer.parseInt(s));
//        System.out.println(str);
//        String str1 = Integer.toOctalString(Integer.parseInt(s));
//        System.out.println(str1);

        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
//        char[] arr = string.toCharArray();
        int countDigits = 0;
//        for (char c : arr) {
//            for (int i = 0; i < arr.length; i++) {
//                if (Character.isDigit(c))
//                    countDigits++;
//            }
//        }
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                countDigits++;
            }
        }
        return countDigits;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
//        char[] arr = string.toCharArray();
        int countLetters = 0;
//        for (char c : arr) {
//            for (int i = 0; i < arr.length; i++) {
//                if (Character.isLetter(c))
//                    countLetters++;
//            }
//        }

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))){
                countLetters++;
            }
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
//        char[] arr = string.toCharArray();
        int countSpaces = 0;
//        for (char c : arr) {
//            for (int i = 0; i < arr.length; i++) {
//                if (Character.isSpaceChar(c))
//                    countSpaces++;
//            }
//        }
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))){
                countSpaces++;
            }
        }
        return countSpaces;
    }
}






