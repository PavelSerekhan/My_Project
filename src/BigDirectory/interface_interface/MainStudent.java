package interface_interface;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new StudentImpl("Ali");
        System.out.println(student.getName());
    }
}
