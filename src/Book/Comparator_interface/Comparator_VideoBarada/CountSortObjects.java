package Book.Comparator_interface.Comparator_VideoBarada;

public class CountSortObjects {
    private int id;
    private String name;
    private int phone;
    private int qualification;

    public CountSortObjects(int id, String name, int phone, int qualification) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getQualification() {
        return qualification;
    }

    @Override
    public String toString() {
        return "[id = " + id + ", name = " + name + ", phone number = " + phone +
                ", qualification = " + qualification + "].";
    }
}
