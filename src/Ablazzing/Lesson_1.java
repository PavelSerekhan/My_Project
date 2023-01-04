package Ablazzing;

import java.util.Arrays;
import java.util.Locale;

public class Lesson_1 {
    public static final String OPEN_TAG = "<data>";
    public static final String CLOSED_TAG = "</data>";
    public static final String EMAIL_SYMBOL = "@";
    public static final String DELIMITER_SYMBOL = ";";
    public static final String MASKING_SYMBOL = "*";
    public static final String DOT_SYMBOL = ".";
    public static final String SPACE_SYMBOL = " ";

    public static void main(String[] args) {
        //Задание №1 -> Базовый уровень ----------
//        String h1 = "        Hello";
//        String world = "WoRld!";
//        char newLine = '\n';
//
//        String h2 = h1.trim() + " " + world.toLowerCase() + newLine;
//        System.out.println(h2.repeat(3));
        //Hello world!
        //Hello world!
        //Hello world!

        //Задание №2
//        double growth = 176;
//        double weight = 90;
//        System.out.println(result(growth, weight));
//    }
//
//    public static double result(double x, double y) {
//        return y / x * x;
//    }

        //Задание №3
//        char[] word = {'a', 'b', 'c', 'd', 'e'};
//        String resultWord = String.copyValueOf(word);     // сделать строку из массива
//        System.out.println(resultWord);
//        word[4] = 'h';
//        String resultNew = String.copyValueOf(word);
//        System.out.println(resultNew);

        //Задание №1 -> Продвинутый уровень -----------
//        String number = "234";
//        String text = "some_text";
//        int numberInt = Integer.parseInt(number);
//        int lengthText = text.length();
//        System.out.println(numberInt + lengthText);

        //Задание №2
//        int a = 3;
//        int b = 5;
//        int result = (a + b);
//        int res = (int) Math.pow(a + b,2); // (a + b) * (a + b);
//        System.out.println(res);

        //Задание №3 //    1,2,5,7,10,  2,3,2,17,15, 2,6,10,119,150
//        int[] array = {1, 2, 5, 7, 10};
//        int[] array2 = {2, 3, 2, 17, 15};
//        int[] res = new int[5];
//        res[0] = array[0] * array2[0];
//        res[1] = array[1] * array2[1];
//        res[2] = array[2] * array2[2];
//        res[3] = array[3] * array2[3];
//        res[4] = array[4] * array2[4];
//        int[] bigArray = new int[15];
//
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            bigArray[count] = array[i];
//            count++;
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            bigArray[count] = array2[i];
//            count++;
//        }
//
//        for (int i = 0; i < res.length; i++) {
//            bigArray[count] = res[i];
//            count++;
//        }
//
//        for (int s : bigArray) {
//            System.out.print(s + " ");
//        }

        //Задание №4
//        String word = "Hello world!";
//        String res = word.replaceAll("l", "r").toUpperCase();
//        System.out.println(res.substring(0,8));
        //Экспертный уровень

        //String.find,  String.replaceAll, String.split, String.join, String.contains
        //String.substring

        String testData = "<client>(Какие-то данные)<data>79991113344;test@yandex.ru;" +
                "Иванов Иван Иванович</data></client> ";
        String testData1 = "<client>(Какие-то данные)<data></data></client> ";
        String testData2 = "<client>(Какие-то данные)<data>Иванов Иван Иванович;" +
                "79991113344</data></client> ";

//        StringBuilder sb = new StringBuilder();
//        sb.append(testData.replaceAll("1","*")
//                .replaceAll("yandex", "******")
//                .replaceAll("Иванович", "И.")
//                .replaceAll("Иванов", "И*****")
//                .replaceAll("test","tes*"));
//        System.out.println(sb);

        System.out.println(masking(testData));
        System.out.println(masking(testData1));
        System.out.println(masking(testData2));
    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSED_TAG, indexStartData);

        if (indexEndData - indexStartData > 0) {
            String clientData = text.substring(indexStartData, indexEndData);

            return new StringBuilder()
                    .append(text, 0, indexStartData)
                    .append(maskingHelper(clientData))
                    .append(text.substring(indexEndData))
                    .toString();
        }
        return text;
    }

    private static String maskingHelper(String clientData) {
        StringBuilder result = new StringBuilder();
        // получаем массив field
        for (String field : clientData.split(DELIMITER_SYMBOL)) {

            if (field.contains(EMAIL_SYMBOL)) {
                maskingEmail(field, result);
            } else if (hasOnlyDigits(field)) {
                maskingNumber(field, result);
            } else {
                maskingFio(field, result);
            }
        }
        return result.substring(0, result.length() - 1);
    }

    // test@yandex.ru / tes*@******.ru  my_mail@gmail.com / my_mai*@*****.com

    private static void maskingEmail(String field, StringBuilder result) {
        int emailIndex = field.indexOf(EMAIL_SYMBOL);
        int dotIndex = field.indexOf(DOT_SYMBOL, emailIndex);

        result.append(new StringBuilder()
                .append(field, 0, emailIndex - 1) // обрезал до @ -1
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(dotIndex - emailIndex - 1))
                .append(field.substring(dotIndex))
                .append(DELIMITER_SYMBOL));
    }

    // Иванов Иван Иванович / И****в Иван И.

    private static void maskingFio(String field, StringBuilder result) {
        int indexFirstName = field.indexOf(" ");
        int indexSecondName = field.indexOf(" ", indexFirstName + 1);

        result.append(new StringBuilder()
                .append(field, 0, 1)
                .append(MASKING_SYMBOL.repeat(indexFirstName - 2))
                .append(field, indexFirstName - 1, indexFirstName)
                .append(SPACE_SYMBOL)
                .append(field, indexFirstName + 1, indexSecondName)
                .append(field, indexSecondName, indexSecondName + 2)
                .append(DOT_SYMBOL)
                .append(DELIMITER_SYMBOL)
        );
    }

    // 79991113344 / 7999***3344
    private static void maskingNumber(String field, StringBuilder result) {
        result.append(new StringBuilder()
                .append(field, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(field, 7, field.length())
                .append(DELIMITER_SYMBOL));

    }

    private static boolean hasOnlyDigits(String field) {
        String digits = "0123456789";

        for (String letter : field.split("")) {
            if (!digits.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}
