package Lesson;

public class Lesson_Enum {

    public static void main(String[] args) {

        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }
    }
}
enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}