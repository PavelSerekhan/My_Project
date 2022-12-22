package JavaRush;

import java.util.Random;

public class Binary {
//    public static void main(String[] args) {
//        int x = 342;
//        int b = 198;
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println(11^199);


//        boolean a = true;
//        System.out.println(!a);
//        System.out.println(!false);
//        System.out.println(!(2<5));
//        new Random().ints(10, 1, 7).forEach(n -> System.out.println(n));


//    public static void main(String[] args) {
//
//        Integer number = 2022;
//
//        // Бинарный формат числа
//        String convert = Integer.toBinaryString(number);
//        System.out.println(convert);
//
//        // Восьмиричная форма
//        convert = Integer.toOctalString(number);
//        System.out.println(convert);
//
//        // Шеснадцатиричная форма
//        convert = Integer.toHexString(number).toUpperCase();
//        System.out.println(convert);
//    }

    /**
     * Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
     * Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
     * Твоя задача — реализовать эти методы.
     *
     * Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
     * i равно 0
     * while(десятичное число не равно 0) {
     * восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
     * десятичное число = десятичное число / 8
     * i увеличиваем на 1
     * }
     * Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
     * i равно 0
     * while(восьмеричное число не равно 0) {
     * десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
     * восьмеричное число = восьмеричное число / 10
     * i увеличиваем на 1
     */
// Восьмеричный конвертер
//    public static void main(String[] args) {
//        int decimalNumber = 21;
//        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
//        int octalNumber = 25;
//        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
//    }
//
//    public static int toOctal(int decimalNumber) {
//        int octalNumber = 0;
//        if (decimalNumber <= 0) {
//            return octalNumber;
//        }
//
//        int i = 0;
//        while (decimalNumber != 0) {
//            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
//            decimalNumber = decimalNumber / 8;
//        }
//        return octalNumber;
//    }
//
//    public static int toDecimal(int octalNumber) {
//        int decimalNumber = 0;
//        if (octalNumber <= 0) {
//            return decimalNumber;
//        }
//
//        int i = 0;
//        while (octalNumber != 0) {
//            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
//            octalNumber = octalNumber / 10;
//        }
//        return decimalNumber;
//    }


//Двоичный конвертер
    /**
     * Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
     * Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
     * Твоя задача — реализовать эти методы.
     */
//    public static void main(String[] args) {
//        int decimalNumber = Integer.MAX_VALUE;
//        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
//        String binaryNumber = "1111111111111111111111111111111";
//        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
//    }
//
//    public static String toBinary(int decimalNumber) {
//        String binaryNumber = "";
//        if (decimalNumber <= 0) {
//            return binaryNumber;
//        }
//
//        while (decimalNumber != 0) {
//            binaryNumber = decimalNumber % 2 + binaryNumber;
//            decimalNumber = decimalNumber / 2;
//        }
//        return binaryNumber;
//    }
//
//    public static int toDecimal(String binaryNumber) {
//        int decimalNumber = 0;
//        if (binaryNumber == null) {
//            return decimalNumber;
//        }
//
//        for (int i = 0; i < binaryNumber.length(); i++) {
//            int index = binaryNumber.length() - 1 - i;
//            int value = Character.getNumericValue(binaryNumber.charAt(index));
//            decimalNumber += value * Math.pow(2, i);
//        }
//        return decimalNumber;
//    }

//    /**
//     * Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
//     * Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
//     * Твоя задача реализовать эти методы.
//     *
//     * Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.
//     */
////Шестнадцатеричный конвертер
//    private static final String HEX = "0123456789abcdef";
//
//    public static void main(String[] args) {
//        int decimalNumber = 1256;
//        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
//        String hexNumber = "4e8";
//        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
//    }
//
//    public static String toHex(int decimalNumber) {
//        String hexNumber = "";
//        if (decimalNumber <= 0) {
//            return hexNumber;
//        }
//
//        while (decimalNumber != 0) {
//            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
//            decimalNumber = decimalNumber / 16;
//        }
//        return hexNumber;
//    }
//
//    public static int toDecimal(String hexNumber) {
//        int decimalNumber = 0;
//        if (hexNumber == null) {
//            return decimalNumber;
//        }
//
//        for (int i = 0; i < hexNumber.length(); i++) {
//            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
//        }
//        return decimalNumber;
//    }

    /**
     * Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toBinary(String) наоборот — из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.
     *
     * Методы работают только с не пустыми строками.
     * Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
     * Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
     * Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
     *
     * Твоя задача — реализовать эти методы.
     */
    //Двоично-шестнадцатеричный конвертер
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element;
            if (substring.equals("0000")) {
                element = "0";
            } else if (substring.equals("0001")) {
                element = "1";
            } else if (substring.equals("0010")) {
                element = "2";
            } else if (substring.equals("0011")) {
                element = "3";
            } else if (substring.equals("0100")) {
                element = "4";
            } else if (substring.equals("0101")) {
                element = "5";
            } else if (substring.equals("0110")) {
                element = "6";
            } else if (substring.equals("0111")) {
                element = "7";
            } else if (substring.equals("1000")) {
                element = "8";
            } else if (substring.equals("1001")) {
                element = "9";
            } else if (substring.equals("1010")) {
                element = "a";
            } else if (substring.equals("1011")) {
                element = "b";
            } else if (substring.equals("1100")) {
                element = "c";
            } else if (substring.equals("1101")) {
                element = "d";
            } else if (substring.equals("1110")) {
                element = "e";
            } else if (substring.equals("1111")) {
                element = "f";
            } else {
                result.setLength(0);
                break;
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if(hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}



