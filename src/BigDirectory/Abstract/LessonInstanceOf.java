package Abstract;

public class LessonInstanceOf {
    public static void main(String[] args) {
        Object o = "Mama";
        Object one = 3;
        boolean inInst1 = one instanceof Integer;
        System.out.println(inInst1);
        boolean inInst = o instanceof Integer;
        System.out.println(inInst);

    }
}
