package Test;

public class Swich_Case {
    public static void main(String[] args) {
        int temperature = 36;

        switch (temperature) {
            case 36:
                System.out.println("Низкая");
                break;
            case 37:
                System.out.println("Нормальная");
                break;
            case 38:
                System.out.println("Высокая");
                break;
            default:
                System.out.println("Нужна скорая");
        }
//                   ||
        switch (temperature) {
            case 36 -> System.out.println("Низкая");
            case 37 -> System.out.println("Нормальная");
            case 38 -> System.out.println("Высокая");
            default -> System.out.println("Нужна скорая");
        }


//        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));


//        public static String getTranslationForDayOfWeek(String ru){
//            String en;
//            if ("понедельник".equals(ru.toLowerCase())) {
//                en = "Monday";
//            } else if ("вторник".equals(ru.toLowerCase())) {
//                en = "Tuesday";
//            } else if ("среда".equals(ru.toLowerCase())) {
//                en = "Wednesday";
//            } else if ("четверг".equals(ru.toLowerCase())) {
//                en = "Thursday";
//            } else if ("пятница".equals(ru.toLowerCase())) {
//                en = "Friday";
//            } else if ("суббота".equals(ru.toLowerCase())) {
//                en = "Saturday";
//            } else if ("воскресенье".equals(ru.toLowerCase())) {
//                en = "Sunday";
//            } else {
//                en = "Недействительный день недели";
//            }
//            return en;


//    public static String getTranslationForDayOfWeek(String ru) {
//        String en;
//        switch (ru.toLowerCase()) {
//            case "понедельник":
//                en = "Monday";
//                break;
//            case "вторник":
//                en = "Tuesday";
//                break;
//            case "среда":
//                en = "Wednesday";
//                break;
//            case "четверг":
//                en = "Thursday";
//                break;
//            case "пятница":
//                en = "Friday";
//                break;
//            case "суббота":
//                en = "Saturday";
//                break;
//            case "воскресенье":
//                en = "Sunday";
//                break;
//            default:
//                en = "Недействительный день недели";
//        }
//        return en;


        int count = 2;
        int value = switch (count) {
            case 1:
                yield 12;
            case 2:
                yield 43;
            case 3:
                yield 33;
            default:
                yield 0;
        };
    }
}

