package Abstract;

public class SolMain {

    //    public static void main(String[] args) throws Exception {
//    }
//
//    public interface Drinker {
//        void askForMore(String message);
//
//        void sayThankYou();
//
//        boolean isReadyToGoHome();
//    }
//
//    public interface Alcoholic extends Drinker {
//        boolean READY_TO_GO_HOME = false;
//
//        void sleepOnTheFloor();
//    }
//
//    public static class BeerLover implements Alcoholic {
//
//        @Override
//        public void askForMore(String message) {
//        }
//
//        @Override
//        public void sayThankYou() {
//        }
//
//        @Override
//        public boolean isReadyToGoHome() {
//            return READY_TO_GO_HOME;
//        }
//
//        @Override
//        public void sleepOnTheFloor() {
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        Drink beer = new AlcoholicBeer();
//        System.out.println(beer.toString());
//    }
//    public interface Drink {
//        boolean isAlcoholic();
//    }
//    public static class AlcoholicBeer implements Drink{
//        @Override
//        public String toString() {
//            if (isAlcoholic()) {
//                return "Напиток алкогольный";
//            } else {
//                return "Напиток безалкогольный";
//            }
//        }
//        @Override
//        public boolean isAlcoholic() {
//            return true;
//        }
//    }

//    public static void main(String[] args) throws Exception {
//        print(new Beer());
//        print(new Cola());
//    }
//
//    private static void print(Drink drink) {
//        System.out.println(drink.getClass().getSimpleName());
//    }
//
//    public interface Drink {
//        boolean isAlcoholic();
//    }
//
//    public static class Beer implements Drink{
//        @Override
//        public boolean isAlcoholic(){
//            return true;
//        }
//    }
//
//    public static class Cola implements Drink{
//        @Override
//        public boolean isAlcoholic(){
//            return false;
//        }
//    }
public static void main(String[] args) {

    System.out.println(Dream.HOBBY.toString());
    System.out.println(new Hobby().toString());

}

    interface Desire {
    }

    interface Dream {
         Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}

