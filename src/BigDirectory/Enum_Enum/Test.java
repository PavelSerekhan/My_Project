package Enum_Enum;

/**
 * Enum - перечисления!
 * используется когда надо перечислить типы объекта(времена года, типы животных и т.д.)
 */
public class Test {
    public static void main(String[] args) {
//        Season season = Season.WINTER;
//        Animal animal = Animal.CAT;
//        System.out.println(animal.name());
//        System.out.println(season.name());

//        Animal frog = Animal.valueOf("FROG");
//        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // ordinal возвращает порядковый номер




//        Animal animal = Animal.CAT;
//        System.out.println(animal);

//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());

//
//        switch (animal) {
//            case CAT -> System.out.println("It's a cat");
//            case DOG -> System.out.println("It's a dog");
//            case FROG -> System.out.println("It's a frog");
//
//        }
//        Season season = Season.SUMMER;
//        switch (season){
//            case SUMMER -> System.out.println("На улице тепло!");
//            case WINTER -> System.out.println("На улице холодно!");
//        }


    }
}
