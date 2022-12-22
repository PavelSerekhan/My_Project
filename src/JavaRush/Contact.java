package JavaRush;

import java.util.Objects;

public class Contact {
    int id;
    String name;
    String phone;

    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", name='" + name + '\''+
                ", number='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }

    public static void main(String[] args) {

        Contact contact1 = new Contact(124,"Vasiliy", "+38002448839");
        Contact contact2 = new Contact(124,"Vasiliy", "+38002448839");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());
        System.out.println(contact1.equals(contact2));
    }
}
