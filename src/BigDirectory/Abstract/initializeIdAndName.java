package Abstract;

import java.io.*;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/**
 * Посмотри на программу и исправь ее, чтобы она компилировалась и работала:
 * Вынеси реализацию метода initializeIdAndName в класс User.
 * Сделай так, чтобы initializeIdAndName в классе User возвращал тип User.
 */
public class initializeIdAndName {
//    public static void main(String[] args) throws Exception {
//        System.out.println(Matrix.NEO);
//        System.out.println(Matrix.TRINITY);
//    }
//
//    static class Matrix {
//        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
//        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
//    }
//
//    interface DBObject {
//        DBObject initializeIdAndName(long id, String name);
//
//    }
//
//    static class User implements DBObject {
//        @Override
//        public User initializeIdAndName(long id, String name) {
//            this.id = id;
//            this.name = name;
//            return this;
//        }
//
//        long id;
//        String name;
//
//        @Override
//        public String toString() {
//            return String.format("The user's name is %s, id = %d", name, id);
//        }
//    }

//    public static void main(String[] args) {
//        User user = new User("Gamer",3);
//        System.out.println(user.getClass().getSimpleName());
//    }
//    static class User{
//        private String name;
//        private int age;
//
//        public User(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }

//    public static void main(String[] args) {
//
//    }
//    interface CanMove{
//        public double speed();
//    }
//    interface CanFly extends CanMove{
//        public double speed(CanFly canFly);
//    }

    /**
     *Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на
     * каждый. Подумай, кому какой.
     * Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential
     * так, чтобы все методы у классов Manager и Subordinate были объявлены в каком-то
     * интерфейсе.
     */
//    public static void main(String[] args) throws Exception {
//    }
//    interface Person {
//        void use(Person person);
//        void startToWork();
//    }
//    interface HasManagementPotential {
//        boolean inspiresOthersToWork();
//    }
//    interface Secretary extends Person{
//    }
//    interface Boss extends Person,HasManagementPotential{
//    }
//    class Manager implements Boss{
//        public void use(Person person) {
//            person.startToWork();
//        }
//        public void startToWork() {
//        }
//        public boolean inspiresOthersToWork() {
//            return true;
//        }
//    }
//    class Subordinate implements Secretary{
//        public void use(Person person) {
//        }
//        public void startToWork() {
//        }
//    }


//    `public static void main(String[] args) throws Exception {
//
//        EnglishTranslator englishTranslator = new EnglishTranslator();
//        System.out.println(englishTranslator.translate());
//    }
//
//    public static abstract class Translator {
//        public abstract String getLanguage();
//
//        public String translate() {
//            return "Я переводчик с " + getLanguage();
//        }
//    }
//    static class EnglishTranslator extends Translator{
//        @Override
//        public String getLanguage(){
//            return "английского";
//        }
//    }


//    public static void main(String[] args) throws IOException {
//        InputStream in = new FileInputStream("E:source.txt");
//        OutputStream ou = new FileOutputStream("E:result.txt");
//
//        while (in.available() > 0){
//            int date = in.read();
//            ou.write(date);
//        }
//        in.close();
//        ou.close();
//    }

    /**
     * В этой задаче тебе нужно:
     * Считать с консоли путь к файлу.
     * Вывести в консоли (на экран) содержимое файла.
     * Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
     */

//    public static void main(String[] args) throws Exception {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sourceFileName = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
//
//        Scanner scanner = new Scanner(fileInputStream);
//        StringBuilder builder = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            builder.append(scanner.nextLine()).append("\n");
//        }
//
//        System.out.print(builder.toString());
//
//        scanner.close();
//        reader.close();
//    }
    public static void main(String[] args) {
        String outputFileName = "e:result2.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                writter.write(line + "\n");
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}




