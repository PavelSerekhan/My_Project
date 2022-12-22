package Test;

/**
 * Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
 * Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора
 * вывести в консоль текст "Небоскреб построен.".
 */
public class Constructor {
//    public Constructor() {
//        System.out.println("Небоскреб построен.");
//    }
//
//    public static void main(String[] args) {
//        Constructor constructor = new Constructor();
//    }


//    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
//    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
//    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
//
//    //напишите тут ваш код
//    public Constructor(){
//        System.out.println(SKYSCRAPER_WAS_BUILD);
//    }
//    public Constructor(int count){
//        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + count);
//    }
//    public Constructor(String str) {
//        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + str);
//    }
//
//    public static void main(String[] args) {
//        Constructor skyscraper = new Constructor();
//        Constructor skyscraperTower = new Constructor(50);
//        Constructor skyscraperSkyline = new Constructor("JavaRushDevelopment");
//    }


    private String type;

//    public Constructor(String type) {
//        this.type = type;
//    }
    public void initialize(String name){
        this.type = name;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.initialize("Барбершоп");

    }
}
