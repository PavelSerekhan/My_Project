package JavaRush;

public class Jarvis {
    public void SayHi(String ... names) {
        for (String name : names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.SayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");
    }
}
