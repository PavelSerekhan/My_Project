package Book.Abstract_class;

public class Student extends Person{

    private String major;

    /**
     * @param name Имя студента
     * @param major Специализация студента
     */

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDestination() {  //destination - назначение
        return "a student majoring in " + major;
    }
}
