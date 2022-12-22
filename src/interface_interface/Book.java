package interface_interface;

/**
 * Чтобы определить интерфейс, используется ключевое слово interface.
 * Если класс наследует интерфейс, то он должен реализовать все методы интерфейса
 * Если класс не реализует какие-то методы интрфейса
 *
 */
public class Book implements Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}
