package JavaRush;

public class ClassStringBuilder {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder("Hello");
//
//        builder.append("Bye");
//        builder.append(123);
//        String result = builder.toString();
//        System.out.println(result);
//
//        builder.deleteCharAt(0);
//        String result1 = builder.toString();
//        System.out.println(result1);
//
//        builder.replace(2,5,"Привет");
//        String result2 = builder.toString();
//        System.out.println(result2);

        /**Нужно реализовать 2 метода, используя StringBuilder: addTo(String, String[]),
         * replace(String, String, int, int).
              Метод addTo(String, String[]) добавляет к строке, полученной первым параметром, все
         строки по порядку из массива строк, полученного вторым параметром, и возвращает объект
         типа StringBuilder на основе этой строки.
         Чтобы добавить новое значение к существующему объекту типа StringBuilder, нужно вызвать
         у него метод append(String), в который передать это новое значение.
              Метод replace(String, String, int, int) заменяет часть строки, полученной первым
         параметром, начиная с индекса, полученного третьим параметром, и заканчивая индексом,
         полученным четвертым параметром, на строку, полученную вторым параметром, и возвращает
         объект типа StringBuilder на основе этой строки.
         Чтобы заменить часть значения объекта типа StringBuilder, нужно у него вызвать метод
         replace(int, int, String), в который передать начальную и конечную позицию для замены,
         а также новое значение.
         *
         */
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ",
                "вода ", "не ", "течет"}));

        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(string);
        for(String str1 : strings){
            builder.append(str1);
        }
        return builder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start,end,str);
    }
}

