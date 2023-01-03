package Extends_Extends_Насделование;


public class Aibolit {

    public void healCat(Cat cat) {
        System.out.println("Пациент здоров!");
        cat.run();
    }

    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();

        Lion simba = new Lion();
        Tiger sherekhan = new Tiger();
        Cheetah chester = new Cheetah();

        aibolit.healCat(simba);
        aibolit.healCat(sherekhan);
        aibolit.healCat(chester);

    }
}
