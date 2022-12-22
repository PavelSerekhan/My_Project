package Book;

import java.io.Console;

public class Console_Class {
    public static void main(String[] args) {
        /**
         * класс работает только с консолью!!!!!!!!!!!!!!!!!!
         */
        Console console = System.console();

            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] password = console.readPassword("Введите пароль:");

//            console.printf("Введенный логин: %s \n", login);
//            console.printf("Введенный пароль: %s \n", new String(password));

    }
}
