package JavaRush.Extands_;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firsPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Pavel");

        user.callAnotherUser(224466,firsPhone);
        // Вращайте ручку
        //Сообщите номер абонента, сэр

        user.callAnotherUser(224466,phone);
        //Вызываю номер 224466

        user.callAnotherUser(224466,videoPhone);
        //Подключаю видеоканал для абонента 224466
    }
}
