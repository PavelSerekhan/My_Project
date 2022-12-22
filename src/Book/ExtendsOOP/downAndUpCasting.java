package Book.ExtendsOOP;

public class downAndUpCasting {
    public static void main(String[] args) {
//    Tiger tiger = new Tiger();
//    Cat cat = new Tiger();
//    Animal animal = new Tiger();
//    Animal animal1 = new Cat();
//    Object odj = new Tiger();
//    Object obj1 = new Animal();

        //downCasting - сужение типа
//        Object obj = new Tiger();
//        Animal animal = (Animal) obj;
//        Cat cat = (Cat)obj;
//        Tiger tiger = (Tiger) animal;
//        Tiger tiger2 = (Tiger) cat;

//        Object obj = new Tiger();
//        if (obj instanceof Cat){
//            Cat cat = (Cat) obj;
//            cat.doCatActions();
//        }

        Animal animal = new Tiger();
        doAllAction(animal);

//        Tiger tiger = new Tiger();
//        tiger.doAnimalActions();
//        tiger.doCatActions();
//        tiger.doTigerActions();
    }
    public static void doAllAction(Animal animal) {
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.doTigerActions();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.doCatActions();
        }
        animal.doAnimalActions();
    }
}
class Animal{
    public void doAnimalActions(){
        System.out.println("Animal");
    }
}
class Cat extends Animal{
    public void doCatActions(){
        System.out.println("Cat extends Animal");
    }
}
class Tiger extends Cat{
    public void doTigerActions(){
        System.out.println("Tiger extends Cat");
    }
}
