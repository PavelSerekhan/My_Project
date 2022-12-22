package JavaRush;

public class ChildClass extends ParentClass{

//    public String c = ParentClass.print("ParentClass.c");
//    public String d = ParentClass.print("ParentClass.d");

    public ChildClass() {
        ParentClass.print("ChildClass.constructor");
    }
}
