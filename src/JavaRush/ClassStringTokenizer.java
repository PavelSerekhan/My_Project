package JavaRush;

import java.util.Arrays;
import java.util.StringTokenizer;

    /**
     * Как разбить строку на несколько частей ,split
     * StringTokenizer - специальный класс, вся работа которого — разделять строку на подстроки.
     */
    public class ClassStringTokenizer {
        public static void main(String[] args) {
            //        String str = "Good news everyone!";
            //        String[] strings = str.split(" "); //можно "ne" -> ["Good ", "ws everyo", "!"]
            //        System.out.println(Arrays.toString(strings));


            //        String str = "Good news everyone!";
            //        StringTokenizer st = new StringTokenizer(str, "ne");
            //        while (st.hasMoreTokens()){
            //            String token = st.nextToken();
            //            System.out.println(token);
            //        }

            String packagePath = "java.util.stream";
            String[] tokens = getTokens(packagePath, "\\.");
            System.out.println(Arrays.toString(tokens));
        }

        public static String[] getTokens(String query, String delimiter) {

            StringTokenizer st = new StringTokenizer(query, delimiter);
            String[] countTokenss = new String[st.countTokens()];

            for (int i = 0; i < countTokenss.length; i++) {
                countTokenss[i] = st.nextToken();
            }
            return countTokenss;
        }
    }

    /**
     Разница лишь в том, что StringBuffer потокобезопасен, и все его методы
     синхронизированы, а StringBuilder — нет. Это единственная особенность.
     StringBuilder в Java работает быстрее StringBuffer’а благодаря несинхронизированности методов.
     Использовать при работе со строками, которые часто будут модифицироваться, в однопоточной среде
     String_Builder - mutable(изменяемый)
     Если строка будет очень часто меняться то надо использовать StringBuilder!
     */

//        public static void main(String[] args) {
//            StringBuilder sb = new StringBuilder("Hello");
//            System.out.println(sb);
//            sb.append(" my").append(" friend").append(" IKS");
//            System.out.println(sb);
//
//
//
//
//
//        }

