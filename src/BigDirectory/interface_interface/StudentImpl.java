package interface_interface;

public class StudentImpl implements Student {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
}

