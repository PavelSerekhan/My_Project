package Abstract;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new MaineCoon();
//        System.out.println(cat instanceof Animal);//Cat extends Animal
//        System.out.println(cat instanceof MaineCoon);//MaineCoon extends Cat
//        Cat cat1 = new Cat();
//        System.out.println(cat1 instanceof MaineCoon );

        //Оператор instanceof проверяет именно происхождение объекта, а не переменной.

//        int bigNumber = 10_000_000;
//        bigNumber = (short) bigNumber;
//        System.out.println(bigNumber);

//        Animal animal = new Pet();
//        animal.introduce();

//        WildAnimal wildAnimal = new Coyote();
//        Coyote coyote = (Coyote) wildAnimal;
//        coyote.introduce();

        Animal animal = new Pet();
        Pet pet = (Pet) animal;
        pet.introduce();


    }
}
