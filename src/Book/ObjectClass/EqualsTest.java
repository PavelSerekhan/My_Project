package Book.ObjectClass;

public class EqualsTest {
    public static void main(String[] args) {
        Employee2 alice1 = new Employee2("Alice Adams", 75000,1987,12,15);
        Employee2 alice2 = alice1;
        Employee2 alice3 = new Employee2("Alice Adams", 75000,1987,12,15);
        Employee2 bob = new Employee2("Bob Brandson", 50000,1989,10,1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));

        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + (alice1.equals(alice3)));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);
    }
}
