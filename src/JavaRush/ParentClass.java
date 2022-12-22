package JavaRush;

public class ParentClass {

//    public String a = ParentClass.print("ParentClass.a");
//    public String b = ParentClass.print("ParentClass.b");

    public ParentClass() {
        ParentClass.print("ParentClass.constructor");
    }

    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
    }
    public static String print(String text){
        System.out.println(text);
        return text;
    }
}
